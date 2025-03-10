#include<iostream>

using namespace std;

int main() {
    int n,t;
    double res = 0;
    cin >> n;
    t = n;
    while(n--){
        int num;
        cin >> num;
        res += num;
    }
    res = res / t;
    cout << res;
}