#include<iostream>

using namespace std;

int main() {
    int arr[5][5] = {0};
    int row = 0, col = 0, count = 0;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            int n;
            cin >> n;
            if (n == 1) {
                arr[i][j] = 1;
                row = i;
                col = j;
            }
        }
    }


    while (1) {
        if (row == 2 && col == 2) break;
        if (row < 2) {
            row++;
        }
        else if (col < 2) {
            col++;
        }
        else if (row > 2) {
            row--;
        }
        else if (col > 2) {
            col--;
        }
        count++;
    }
    cout << count;
    
}