#include<iostream>
#include<vector>

using namespace std;

int main() {
    int t;
    cin >> t;
    vector<string> ans;
    while (t--)
    {
        int n;
        string s;
        cin >> n;
        cin >> s;
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s[i]; 
            if (ch == 'U') {
                count++;
            }
        }
        if (count % 2 == 1) {
            ans.push_back("YES");
        }else {
            ans.push_back("NO");
        }
    }
    for (string s : ans) {
        cout << s << endl;
    }
}   