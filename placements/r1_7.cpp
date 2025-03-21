#include<iostream>

using namespace std;

int main() {
    int n = 5;
    int* arr = (int*)malloc(n+1 * sizeof(int));
    
    for (int i = 0; i <= n; i++) {
        int count = 0, temp = i;
        while(temp > 0) {
            if (temp % 2 != 0){
                count++;
            }
            temp = temp >> 1;
        }
        arr[i] = count;
    }

    for(int i = 0; i <= n; i++){
        cout << arr[i] << " ";
    }
}