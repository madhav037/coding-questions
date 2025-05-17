/*
Given a Roman numeral, convert it to an
integer.(But we should also give them
roman letters value )
input = "MMXXV" Output :- 2025
*/

#include<iostream>
#include<vector>
#include <unordered_map>

using namespace std;


// O(n)
int roman_to_int(string s){
	unordered_map<char, int> romanValues = {
	        {'I', 1}, {'V', 5}, {'X', 10}, {'L', 50},
	        {'C', 100}, {'D', 500}, {'M', 1000}
    };
	int output = 0;
	int prev = 0;

	for (int i = s.length() - 1; i >= 0; i--) {
		int current_value = romanValues[s[i]];

		if (current_value < prev){
			output -= current_value;
		}
		else {
			output += current_value;
		}

		prev = current_value;
	}
	return output;
}


int main() {

    string input = "MMXXV";

    int output = roman_to_int(input);

    cout << output;
}