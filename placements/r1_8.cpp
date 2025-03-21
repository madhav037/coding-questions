/*Convert a String to an Integer using Recursion*/

#include<iostream>

using namespace std;

int string_to_int(string str, int length) {
    if (length == 0) {
        return 0;
    }
    int digit = str[length - 1] - '0';
    return string_to_int(str, length - 1) * 10 + digit;
}

int main() {
    string s = "1234";
    cout << string_to_int(s, s.length());
}