#include<iostream>
#include<vector>
#include<set>
using namespace std;

int main() {
    int n, temp;
    cin >> n;
    temp = ++n;
    while (true)
    {
        vector<int> yr;
        while(n > 0) {
            yr.push_back(n % 10);
            n /= 10;
        }
        set<int> s(yr.begin(), yr.end());
        if (s.size() == yr.size()) {
            cout << temp;
            break;
        }else {
            temp++;
            n = temp;
        }
    }
    

}