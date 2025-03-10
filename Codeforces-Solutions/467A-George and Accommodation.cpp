#include<iostream>

using namespace std;

int main() {
    int t, count = 0;
    cin >> t;
    while (t--){
        int p,q;
        cin >> p >> q;
        if ((q-p) >= 2){
            count++;
        }
    }
    cout << count;
}