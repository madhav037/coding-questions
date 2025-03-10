#include<iostream>

using namespace std;

int main() {
    long long k, n, w, price = 0; 
    cin >> k >> n >> w;

    price = k * (w * (w+1) / 2);
    if (n >= price) {
        cout << 0;
    }else {
        cout << price - n;
    } 
}
