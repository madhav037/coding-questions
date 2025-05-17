param ([string]$filename)

if (-not $filename) {
    Write-Host "Usage: .\cmon.ps1 <filename.c>" -ForegroundColor Yellow
    exit
}

$output = [System.IO.Path]::GetFileNameWithoutExtension($filename) + ".exe"
$logfile = "errors.log"

function Cleanup {
    if (Test-Path $output) {
        Remove-Item $output -Force
        Write-Host "🧹 Cleaned up: Removed $output" -ForegroundColor Cyan
    }
    exit
}

# Handle Ctrl+C
$global:stopScript = $false
$handler = {
    $global:stopScript = $true
    Cleanup
}
[Console]::TreatControlCAsInput = $false
$null = Register-ObjectEvent -InputObject ([AppDomain]::CurrentDomain) `
    -EventName "ProcessExit" -Action $handler

Write-Host "🔍 Watching $filename for changes... Press Ctrl+C to stop." -ForegroundColor Cyan
$lastWriteTime = (Get-Item $filename).LastWriteTime

try {
    while (-not $global:stopScript) {
        Start-Sleep -Milliseconds 500
        $newWriteTime = (Get-Item $filename).LastWriteTime
        if ($newWriteTime -ne $lastWriteTime) {
            Clear-Host
            Write-Host "🛠️  Compiling $filename..." -ForegroundColor Blue
            gcc $filename -o $output 2> $logfile

            if ($?) {
                Write-Host "✅ Compilation successful! Running..." -ForegroundColor Green
                & ".\$output"
            } else {
                Write-Host "❌ Compilation failed! Check $logfile for errors." -ForegroundColor Red
                Get-Content $logfile | Write-Host -ForegroundColor DarkRed
            }
            $lastWriteTime = $newWriteTime
        }
    }
} finally {
    Cleanup  # Deletes the .exe file when you press Ctrl+C
}