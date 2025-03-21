/*program to count number of vowels and consonants in a String
input :"abcdefghijklmnopqrstuvwxyz"
output:Vowels: 5 Consonants: 21*/

#include<iostream>

using namespace std;

int main() {
    string s = "abcdefghijklmnopqrstuvwxyz", vol = "aeiou";
    int vowels = 0, consonants = 0;

    for(char ch : s){
        if (vol.find(ch) != string::npos) {
            vowels++;
        }else {
            consonants++;
        }
    }

    cout << "Vowels : " << vowels << " Consonants : " << consonants;
}