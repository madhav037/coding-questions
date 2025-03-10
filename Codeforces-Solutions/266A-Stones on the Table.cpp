#include<iostream>

using namespace std;

int main() {
    int num_of_stones;
    cin >> num_of_stones;
    int i = 0, count = 0;
    char* stones = new char[num_of_stones];
    while (num_of_stones--)
    {
        cin >> stones[i];
        i++;
    }

    for (int j = 0; j < i-1; j++)
    {
        if (stones[j] == stones[j+1]) {
            count++;
        }
    }

    cout << count;
    
       
    delete[] stones; // Free the dynamically allocated memory
}