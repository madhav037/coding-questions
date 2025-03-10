#include<iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    int* arr = new int[t];
    for(int i = 0; i < t; i++) {
        cin >> arr[i];
    }

    int max = 0;
    for(int i = 0; i < t; i++) {
        int count = 1;
        int j = i;
        while(j < t - 1 && arr[j] >= arr[j + 1]) {
            count++;
            j++;
        }
        j = i;
        while(j > 0 && arr[j] >= arr[j - 1]) {
            count++;
            j--;
        }
        if(count > max) {
            max = count;
        }
    }
    cout << max << endl;
}