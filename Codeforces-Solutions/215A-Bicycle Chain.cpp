#include <iostream>

using namespace std;

int main()
{
    int n, m, max = 0, count = 1;

    cin >> n;

    int *a = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    cin >> m;

    int *b = new int[m];
    for (int i = 0; i < m; i++)
    {
        cin >> b[i];
    }

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (b[i] % a[j] != 0)
                continue;

            int temp = b[i] / a[j];
            if (max < temp)
            {
                max = temp;
                count = 1;
            }
            else if (max == temp)
            {
                count++;
            }
        }
    }
    cout << count;
}