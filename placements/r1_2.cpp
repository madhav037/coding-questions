/*You are given a string s and a list of words wordDict. Your task is to determine if s can be segmented into a sequence of one or more words from wordDict. You may assume that all words in wordDict are non-empty and that each word can be used multiple times.*/

// me
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    string s = "leetcode";
    vector<string> wordDict = {"leet", "code"};

    for (int i = 0; i < wordDict.size(); i++)
    {
        string word = wordDict.at(i);
        for (int j = 0; j <= s.size(); j += word.size())
        {
            string sub = s.substr(j,j+word.size());
            if (word == sub)
            {
                wordDict[i] = "true";
            }
        }
    }

    int count = 0;
    for (int i = 0; i < wordDict.size(); i++) {
        if (wordDict[i] == "true") {
            count++;
        }
    }

    if (count == wordDict.size()) {
        cout << "True";
    }else {
        cout << "False";
    }
}


// ai
#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

bool wordBreak(string s, vector<string>& wordDict) {
    unordered_set<string> wordSet(wordDict.begin(), wordDict.end());
    vector<bool> dp(s.size() + 1, false);
    dp[0] = true;

    for (int i = 1; i <= s.size(); ++i) {
        for (int j = 0; j < i; ++j) {
            if (dp[j] && wordSet.find(s.substr(j, i - j)) != wordSet.end()) {
                dp[i] = true;
                break;
            }
        }
    }

    return dp[s.size()];
}

int main() {
    string s = "leetcode";
    vector<string> wordDict = {"leet", "code"};

    if (wordBreak(s, wordDict)) {
        cout << "True";
    } else {
        cout << "False";
    }
}