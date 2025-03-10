#include<iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int solveable = 0;

    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < 3; j++) {
            int ans;
            cin >> ans;
            if (ans == 1) {
                count++;
            }
        }
        if (count >= 2) {
            solveable++;
        }
    }
    cout << solveable;
       
}