#include <iostream>

using namespace std;

int main()
{
    int length, totalL = 0, totalR = 0, count = 1;
    bool flag = true;
    string number;
    cin >> length >> number;

    while (number != "")
    {
        int last = number.back() - '0';
        if (last != 4 && last != 7)
        {
            cout << "NO";
            flag = false;
            break;
        }
        if (count <= length / 2)
        {
            totalL += last;
        }
        else
        {
            totalR += last;
        }
        count++;
        number.pop_back();
    }
    // cout << flag << totalL << totalR;
    if (flag)
    {
        if (totalL == totalR)
        {
            cout << "YES";
        }
        else
        {
            cout << "NO";
        }
    }
}