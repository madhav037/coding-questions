#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    long long n, place;
    cin >> n >> place;

    long long ans;
    long long half = (n + 1) / 2; 
    if (place <= half) {
        ans = 2 * place - 1;
    } else {
        ans = 2 * (place - half);
    }
    cout << ans;
}