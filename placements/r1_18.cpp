/*
Given strings s and t, check if s is a
subsequence of t.
Input: s = "abc", t = "ahbgdc" Output: true
*/

#include<iostream>

using namespace std;


// O(n) n = length of t string
bool check_subsequence(string s, string t) {
    if (s.length() > t.length()) return false;

    int index_s = 0;

    for (char c : t) {
        if (index_s < s.length() && s[index_s] == c) {
            index_s++;
            if (index_s == s.length()) return true;
        }
    }

    return index_s == s.length();
}

int main() {
	string s = "abc";
	string t = "ahbgdc";

	cout << check_subsequence(s, t);
}