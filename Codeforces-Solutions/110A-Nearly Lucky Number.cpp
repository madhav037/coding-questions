#include<iostream>
#include <cstdint>

using namespace std;

int main() {
    int64_t n;
    int count = 0;
    cin >> n;
    while (n > 0)
    {
        int rem = n % 10;
        if (rem == 4 || rem == 7) {
            count++;
        }
        n /= 10;
    }
    if (count == 4 || count == 7) {
        cout << "YES";
    }else {
        cout << "NO";
    }
    
}