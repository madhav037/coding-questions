#include<iostream>

using namespace std;

int main() {
    string str, ans = "";
    cin >> str;
    int count1 = 0, count2 = 0, count3 = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str[i] == '1') {
            count1++;
        }
        else if (str[i] == '2') {
            count2++;
        }
        else if (str[i] == '3') {
            count3++;
        }
    }
    
    while (count1 != 0 || count2 != 0 || count3 != 0) {
        if (count1 > 0) {
            ans += "1";
            count1--;
        }
        else if (count2 > 0) {
            ans += "2";
            count2--;
        }
        else if (count3 > 0) {
            ans += "3";
            count3--;
        }
        if (count1 != 0 || count2 != 0 || count3 != 0) {
            ans += "+";
        }
        
    }
    cout << ans;
    

}