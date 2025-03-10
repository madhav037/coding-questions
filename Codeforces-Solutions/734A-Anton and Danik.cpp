#include<iostream>

using namespace std;

int main() {
    string s;
    int n, countA = 0, countD = 0;
    cin >> n;
    cin >> s;

    for (char ch : s) {
        if (ch == 'A') {
            countA++;
        }else {
            countD++;
        }
        if (countA > n/2) {
            cout << "Anton";
            break;
        }
        else if (countD > n/2) {
            cout << "Danik";
            break;
        }
    }
    if (countA == countD)
    {
        cout << "Friendship";
    }
}