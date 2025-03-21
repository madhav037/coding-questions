/*Find the Digital Root of a Number.
Input: 9875
Output: 2 (9+8+7+5=29 → 2+9=11 → 1+1=2)
*/

#include <iostream>

using namespace std;

int digitalRootRecursive(int n)
{
    if (n < 10)
    {
        return n;
    }

    int sum = 0;
    while (n > 0)
    {
        sum += n % 10;
        n /= 10;
    }

    return digitalRootRecursive(sum);
}

int main()
{
    int n = 9875;
    int root = digitalRootRecursive(n);
    cout << n << endl;
    return 0;
}