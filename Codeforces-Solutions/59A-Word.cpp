#include<iostream>
#include<cctype>
#include <algorithm>
using namespace std;

int main() {
    int count = 0, word_len = 0;
    string word;
    cin >> word;
    for (char i : word) {
        word_len++;
        if ((int)i >= 65 && (int)i <= 90) count++;
    }
    if (word_len - count >= count) {
        transform(word.begin(), word.end(), word.begin(), ::tolower);
    }else {
        transform(word.begin(), word.end(), word.begin(), ::toupper);
    }
    cout << word;
}
