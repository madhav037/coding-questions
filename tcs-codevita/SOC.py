n, m = map(int, input().split())
grid = [list(map(int, input().split())) for i in range(n)]
k = int(input())

table = [[0] * m for i in range(n)]
for i in range(n):
    for j in range(m):
        if i + 1 < n and grid[i+1][j] >= grid[i][j]:
            if table[i][j] == 0:
                table[i+1][j] +=1
            else:
                table[i+1][j] += table[i][j]+1
        if j + 1 < m and grid[i][j+1] >= grid[i][j]:
            if table[i][j] == 0:
                table[i][j+1] +=1
            else:
                table[i][j+1] += table[i][j]+1
                
result = []
for i in range(n):
    for j in range(m):
        if table[i][j] == k:
            result.append((i, j))


if result:
    for cell in result:
        print(cell[0], cell[1])
else:
    print("NO")