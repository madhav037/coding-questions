#include<iostream>
#include<string>

using namespace std;

int main() {
    int n;
    cin >> n;
    string arr[n] = {""};
    for (int i = 0; i < n; i++) {
        string str;
        cin >> str;
        if (str.length() > 10) {
            arr[i] = str[0] + to_string(str.length()-2) + str.back();
        }else {
            arr[i] = str;
        }  
    }
    for (int i = 0; i < n; i++) {
        cout << arr[i] << endl;
    }
    
}