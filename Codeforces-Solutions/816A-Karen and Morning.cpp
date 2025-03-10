#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

string reverse_item(string a)
{
    reverse(a.begin(), a.end());
    return a;
}

string increment_by_one(string a)
{
    int b = stoi(a);
    b++;
    if (b / 10 == 0)
    {
        return "0" + to_string(b);
    }
    else
    {
        return to_string(b);
    }
}

int main()
{
    string time;
    cin >> time;

    string timeArr[2];

    int change = 1, count = 0;

    for (int i = 0; i < time.length(); i++)
    {
        if (time[i] == ':')
        {
            change = 0;
            continue;
        }
        if (change)
        {
            timeArr[0] += time[i];
        }
        else
        {
            timeArr[1] += time[i];
        }
    }

    while (true)
    {
        string rev_min = reverse_item(timeArr[1]);
        if (rev_min == timeArr[0])
        {
            cout << count;
            break;
        }
        count++;
        timeArr[1] = increment_by_one(timeArr[1]);
        if (timeArr[1] == "60")
        {
            timeArr[1] = "00";
            timeArr[0] = increment_by_one(timeArr[0]);
        }
        if (timeArr[0] == "24")
        {
            timeArr[0] = "00";
        }
    }
}