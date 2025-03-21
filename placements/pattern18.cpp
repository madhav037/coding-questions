/*
E
D E
c D E
B C D E
A B C D E
*/

#include<iostream>

using namespace std;

int main() {
    int n = 5; 

    for (int i = 0; i < n; i++) {
        char ch = 'E' - i; 

        for (int j = 0; j <= i; j++) {
            cout << char(ch + j) << " "; 
        }
        cout << endl;
    }
}