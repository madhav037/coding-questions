#include<iostream>

using namespace std;

int main() {
    int n;
    bool check = true;
    cin >> n;
    while (n--) {
        int a;
        cin >> a;
        if ( a == 1 ) {
            check = false;
            break;
        }
    }   
    if (check) {
        cout << "EASY";
    }else {
        cout << "HARD";
    }
}