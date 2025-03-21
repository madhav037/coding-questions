/*Given two words word1 and word2, return the minimum number of operations required to convert word1 to word2. You have the following operations allowed: (1. Insert a character | 2. Delete a character | Replace a character)The minimum number of operations is: (1. Replace 'i' with 'e' | 2. Replace 'n' with 'x' | 3. Replace 't' with 'e' | 4. Insert 'c' | 5. Insert 'u')
word1 = "intention", word2 = "execution"
output: 5*/

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int editDistanceMemo(string word1, string word2, int m, int n, vector<vector<int>> &dp)
{
    if (m == 0)
        return n;

    if (n == 0)
        return m;

    if (dp[m][n] != -1)
    {
        return dp[m][n];
    }

    if (word1[m - 1] == word2[n - 1])
    {
        return dp[m][n] = editDistanceMemo(word1, word2, m - 1, n - 1, dp);
    }

    return dp[m][n] = 1 + min(min(editDistanceMemo(word1, word2, m, n - 1, dp),      
                                  editDistanceMemo(word1, word2, m - 1, n, dp),     
                                  editDistanceMemo(word1, word2, m - 1, n - 1, dp)),
                              1);
}

int main()
{
    string word1 = "intention";
    string word2 = "execution";
    int m = word1.length();
    int n = word2.length();

    vector<vector<int>> dp(m + 1, vector<int>(n + 1, -1));

    cout << "Minimum number of operations is "
         << editDistanceMemo(word1, word2, m, n, dp) << endl;

    return 0;
}