#include <iostream>

using namespace std;

int main()
{
    string vic1, vic2;
    cin >> vic1 >> vic2;

    int n;
    cin >> n;
    cout << vic1 << " " << vic2 << endl;
    while (n--)
    {
        string s1, s2;
        cin >> s1 >> s2;
        if (s1 == vic1)
        {
            vic1 = s2;
        }
        else if (s1 == vic2)
        {
            vic2 = s2;
        }
        else if (s2 == vic1)
        {
            vic1 = s1;
        }
        else if (s2 == vic2)
        {
            vic2 = s1;
        }
        cout << vic1 << " " << vic2 << endl;
    }
}