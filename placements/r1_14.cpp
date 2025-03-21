/*Check if an integer is rotation of another given integer
input:A=976,B=679
output :yes*/

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int a = 976, b = 679;
    int temp = a, flag = 1, length_of_digit = 0;

    while (temp > 0)
    {
        length_of_digit++;
        temp /= 10;
    }

    temp = a;
    while (flag)
    {
        int term = a / pow(10, length_of_digit-1);
        a = a % static_cast<int>(pow(10, length_of_digit-1));
        a = a*10+term;
        if (a == b)
        {
            flag = 0;
            cout << "True";
        }
        if (a == temp)
        {
            flag = 0;
            cout << "False";
        }
    }
}