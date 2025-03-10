#include<iostream>

using namespace std;

int main() {
    int n, count = 0, max = 0;
    cin >> n;
    while(n--) {
        int out, in;
        cin >> out >> in;
        count = count - out + in;
        if (max < count) {
            max = count;
        }
    }   
    cout << max;
}