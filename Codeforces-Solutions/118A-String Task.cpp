#include<iostream>
#include<cctype>
using namespace std;

int main() {
    string input, output = "";
    cin >> input;

    for(char i : input) {
        i = tolower(i);
        if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u' && i != 'y') {
        // cout << i;
            output += '.';
            output += i;
        }
    }

    cout << output;
}