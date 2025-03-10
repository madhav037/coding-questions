#include<iostream>
#include<algorithm>

using namespace std;

int main() {
    string num1, num2, res = "";
    cin >> num1 >> num2;
    while(num1 != ""){
        char t1 = num1.back();
        char t2 = num2.back();
        res += ((t1 - '0') ^ (t2 - '0')) + '0';
        num1.pop_back();
        num2.pop_back();
    }

    reverse(res.begin(), res.end());
    cout << res;   
}