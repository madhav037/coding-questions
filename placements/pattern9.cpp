/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/

#include<iostream>

using namespace std;

int main() {
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        for (int j = n-1; j > i; j--) {
            cout << " ";
        }
        for (int k = 0; k < 2*(i)+1; k++) {
            cout << "*";
        }
        cout << endl;
    }
    for (int i = n; i > 0; i--) {
        for (int j = 0; j < n-i; j++) {
            cout << " ";
        }
        for (int k = 2*i-1; k > 0; k--){
            cout << "*";
        }
        cout << endl;
    }
}