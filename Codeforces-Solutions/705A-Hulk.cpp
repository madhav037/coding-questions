#include<iostream>

using namespace std;

int main() {
    int n, i = 1;
    cin >> n;
    string ans = "", str1 = "I hate", str2 = "I love", str3 = "that", str4 = "it";   
    while(i <= n){
        if (i % 2 == 0){
            ans += str2;
        }else{
            ans += str1;
        }
        ans += " "; 
        if(i < n){
            ans += str3 + " ";
        }
        i++;
    }
    ans += str4;
    cout << ans;
}