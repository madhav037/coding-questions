#include<iostream>

using namespace std;

int main() {
    int count = 1;
    string str;
    cin >> str;
    char compare = str[0];

    for (int i = 0; i < str.length(); i++) {
        if (compare == str[i]) {
            count++;
        }else {
            compare = str[i];
            count = 1;
        }

        if (count == 7) {
            cout << "YES";
            count = -1;
            break;
        }
    }
    if (count != -1) {
        cout << "NO";
    }
}