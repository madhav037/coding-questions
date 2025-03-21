/*
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/

#include <iostream>

using namespace std;

int main()
{
    int n = 4;

    for (int i = 0; i < 2 * n - 1; i++)
    {
        for (int j = 0; j < 2 * n - 1; j++)
        {
            int value = n - min(min(i, j), min(2*n-2-i, 2*n-2-j));
            cout << value;
        }
        cout << endl;
    }
}