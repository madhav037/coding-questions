/*
Given a string s, reverse the order of
words.
Input: " the sky is blue " Output: "blue is sky the"
*/

#include<iostream>
#include <sstream>
#include <vector>
using namespace std;


// O(n)
string reverse_string(string s) {
	string reverse = "", word = "";
	for (char ch : s){
		if (ch == ' '){
			reverse = word + " " + reverse;
			word = "";
		}else {
			word += ch;
		}
	}
	return word + " " + reverse;
}

// O(n)
string reverse_string_op(string s) {
    stringstream ss(s);
    string word;
    vector<string> words;

    while (ss >> word) {  // Removes extra spaces automatically
        words.push_back(word);
    }

    string result = "";
    for (int i = words.size() - 1; i >= 0; --i) {
        result += words[i] + (i ? " " : "");  // Efficient concatenation
    }

    return result;
}

// complete without using library O(n)

string trim(string s) {
	int start = 0;
	int end = s.length() - 1;

	while(start <= end && s[start] == ' ') start++;
	while(end >= start && s[end] == ' ') end--;

	return s.substr(start, end-start+1);
}


string rev_str_op(string s){
	string reverse = "", word = "";
	s = trim(s);
	for (char ch : s){
		if (ch == ' ') {
            if (!word.empty()) {
                reverse = word + " " + reverse;
                word = "";
            }
        } else {
            word += ch;
        }
	}
	return trim(word + " " +reverse);
}



int main() {
	string s = " The sky   is blue ";
	cout << rev_str_op(s);
}