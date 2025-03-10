#include<iostream>

using namespace std;

int main() {
    int i = 0;
    string s = "hello", str;
    cin >> str;
    for (char ch : str) {
        if (ch == s[i]) {
            i++;
        }
    }   
    if (i == 5) {
        cout << "YES";
    }else {
        cout << "NO";
    }
}