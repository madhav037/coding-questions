#include<iostream>

using namespace std;

int main() {
    int t, count = 1;
    string magnet;
    cin >> t; 
    cin >> magnet;
    while (--t){
        string m;
        cin >> m;
        if (magnet != m){
            count++;
            magnet = m;
        }
    }
    cout << count;   
}