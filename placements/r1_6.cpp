#include<iostream>
#include<string>

using namespace std;

int main() {
    int deci = 10;
    string bin = "";    
    while (deci > 0) {
        int rem = deci % 2;
        bin += to_string(rem);
        deci /= 2;
    }   
    for(int i = bin.length()-1; i >= 0; i--) {
        cout << bin[i];
    }
}