#include<iostream>

using namespace std;

int main() {
    string s, t;
    cin >> s >> t;
    bool flag = true;
    int i = 0, j = t.size();
    while (j--)
    {
        if (s[i] != t[j]) {
            flag = false;
            break;
        }
        i++;
    }

    if (flag) {
        cout << "YES";
    }else {
        cout << "NO";
    }
    
}   