#include <iostream>
#include <vector>
using namespace std;

bool isAlmostLucky(int n) {
    vector<int> luckyNumbers = {
        4, 7, 44, 47, 74, 77, 444, 447, 
        474, 477, 744, 747, 774, 777
    };
    
    for (int lucky : luckyNumbers) {
        if (n % lucky == 0) {
            return true;
        }
    }
    return false;
}

int main() {
    int n;
    cin >> n;

    if (isAlmostLucky(n)) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

    return 0;
}
