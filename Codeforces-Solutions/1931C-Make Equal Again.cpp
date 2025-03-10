#include<iostream>
#include<vector>
using namespace std;

void solve() {
    int n;
    cin >> n;
    vector<int> v(n);

    for(auto &i:v) cin >> i;
    
    int i = 0, j = n-1, left = 0, right = 0;
    
    while(i < n && v[i] == v[0])    i++, left++;
    while(j >= 0 && v[j] == v[n-1]) j--, right++;
    
    if(v[0] == v[n-1])
        cout << max(0, n-left-right) << endl;
    else
        cout << min(n-left, n-right) << endl;
}

int main() {
    int t;
    cin >> t;
    while (t--) 
        solve();
}