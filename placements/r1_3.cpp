/*Longest Substring Without Repeating Characters Write a function to find the length of the longest substring without repeating characters in a given string.*/
#include<iostream>

using namespace std;

int longest_substring(string s){
    int count = 1;
    for (int i = 0; i < s.length() -1 ; i++) {
        if (s.at(i) != s.at(i+1)){
            count++;
        }
    }
    return count;
}

int main() {
    string s1 = "abcc";
    string s2 = "rrrrr";

    cout << longest_substring(s2);
}