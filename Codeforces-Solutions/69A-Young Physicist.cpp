#include<iostream>

using namespace std;

int main() {
    int n, i = 0, sum;
    cin >> n;
    int **arr = new int*[n];
    for (int i = 0; i < n; ++i) {
        arr[i] = new int[3];
    } 
    while (n--) {
        cin >> arr[i][0];
        cin >> arr[i][1];
        cin >> arr[i][2];
        i++;
    }
    
    for (int p = 0; p < 3; p++) {
        sum = 0;
        for (int q = 0; q < i; q++) {
            sum += arr[q][p];
        }
        if (sum != 0) {
            cout << "NO";
            sum = -1;
            break;
        }
    }
    if (sum != -1) {
        cout << "YES";
    }

    for (int i = 0; i < n; ++i) {
        delete[] arr[i];
    }
    delete[] arr;
       
}