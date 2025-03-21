/*Find the sum of the first N prime numbers.*/
#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int n = 5, count = 0, lim = 2, sum = 0;
    while (count < n)
    {
        bool flag = true;
        for (int i = 2; i <= sqrt(lim); i++)
        {
            if (lim % i == 0)
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            count++;
            sum += lim;
        }
        lim++;
    }
    cout << sum;
}