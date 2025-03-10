#include<iostream>
#include<math.h>

using namespace std;

int main() {
    long long int n, ans = 0, count = 1;
    cin >> n;
    if (n % 2 == 0) {
        ans = n / 2;
    } else {
        ans = -(((n - 1) / 2)+1);  
    }
    cout << ans;
}