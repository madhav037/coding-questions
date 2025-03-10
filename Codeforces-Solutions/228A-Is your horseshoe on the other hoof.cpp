#include <iostream>

using namespace std;

int main()
{
    int n = 0, count = 0;
    string str;
    while (n < 4)
    {
        string s = "";
        cin >> s;
        size_t index = str.find(s);
        if (index != string::npos)
        {
            count++;
        }
        str += s;
        n++;
    }

    cout << count;
}
