/*Find the minimum positive integer such that it is divisible by A and sum of its digits is equal to B
input :A=20,B=30
output :49980*/

#include<iostream>

using namespace std;

int main() {
    int a = 20, b = 30, i = 0;
    bool flag = true;
    while(flag) {
        int temp = i, sum = 0;
        while (temp > 0)
        {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        cout << i << " " << sum << endl;
        if (sum == b) {
            flag = false;
            cout << "answer : " << i << endl;
        }else {
            i += a;
        }
    }
}