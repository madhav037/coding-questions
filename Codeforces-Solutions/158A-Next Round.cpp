#include<iostream>

using namespace std;

int main() {
    int n,k, count = 0;
    cin>>n>>k;
    k--;
    int arr[n] = {0};
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++) {
        if (arr[i] >= arr[k] && arr[i] > 0) {
            count++;
        }
    }
    cout << count;
}
