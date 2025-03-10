// can't find the question
#include <iostream>

using namespace std;

int main()
{
    int t;
    cin >> t;
    string ugly1 = "map";
    string ugly2 = "pie";

    while (t--)
    {
        int lenOfString;
        cin >> lenOfString;
        string s;
        cin >> s;

        if (s.find(ugly1) || s.find(ugly2)) {
            string s1 = s.substr(0, s.find(ugly2));
            cout << s1 << endl;
            // cout << "ugly1 found in string "<< s << endl;
        }

    }
}
