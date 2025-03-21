/*Write a program that outputs the string representation of numbers from 1 to n. But for multiples of three it should output "Fizz" instead of the number and for the multiples of five output "Buzz". For numbers which are multiples of both three and five output "FizzBuzz".*/
#include<iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    string* arr = new string[n+1];
    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0) {
            arr[i] = "Fizz";
            cout << "Fizz";
        }
        else if (i % 5 == 0) {
            arr[i] = "Buzz";
            cout << "Buzz";
        }
        else if (i % 3 == 0 && i % 5 == 0) {
            arr[i] = "FizzBuzz";
            cout << "FizzBuzz";
        }
        else {
            arr[i] = i;
            cout << i;
        }
    }
}