#include<iostream>

using namespace std;

int main() {
    int num, times;
    cin >> num >> times;
    while (times--)
    {
        int rem = num % 10;
        if (rem == 0) {
            num /= 10;
        }else {
            num -= 1;
        }
    }

    cout << num;
    
}