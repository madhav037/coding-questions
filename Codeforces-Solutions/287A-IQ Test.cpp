#include <iostream>
#include <unordered_map>

using namespace std;

int main()
{
    unordered_map<char, int> map;
    bool flag = false;
    string input[4];
    char arr[4][4];  

    for (int i = 0; i < 4; i++)
    {
        cin >> input[i];
    }

    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            arr[i][j] = input[i][j];  
        }   
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            map['#'] = 0;
            map['.'] = 0;

            map[arr[i][j]]++;
            map[arr[i+1][j]]++;
            map[arr[i+1][j+1]]++;
            map[arr[i][j+1]]++;

            if (map['#'] >= 3 || map['.'] >= 3)
            {
                cout << "YES";
                flag = true;
                break;
            }
        }
        if (flag)
        {
            break;
        }
    }

    if (!flag)
    {
        cout << "NO";
    }
}
