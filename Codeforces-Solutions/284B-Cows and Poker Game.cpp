#include<iostream>
#include<algorithm>

using namespace std;

int main() {
    int n;
    string str = "";
    cin >> n;

    while(n--){
        char card;
        cin >> card;
        str += card;
    }   
    int a = count(str.begin(), str.end(),'A');
    int f = count(str.begin(), str.end(),'F');
    int i = count(str.begin(), str.end(),'I');
    if (i == 1){
        cout << 1;
    } else if (i > 1){
        cout << 0;
    } else {
        cout << a;
    }
}