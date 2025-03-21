/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

#include<iostream>

using namespace std;

int main() {
    int n;
    bool count = true;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        bool start_with_one = (i % 2 == 0);

        for (int j = 0; j <= i; ++j) {
            if (start_with_one) {
                cout << (j % 2 == 0 ? 1 : 0);
            } else {
                cout << (j % 2 == 0 ? 0 : 1);
            }
            cout << " ";
        }
        cout << endl;
    } 
}