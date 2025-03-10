#include<iostream>
#include<algorithm>
#include<vector>
#include<numeric>
using namespace std;

int main() {
    int num_of_coins, total = 0, sum = 0, count = 0, start = 0, end = 1;
    vector<int> v;
    cin >> num_of_coins;
    while (num_of_coins--){
        int coin;
        cin >> coin;
        total += coin;
        v.push_back(coin);
    }
    sort(v.rbegin(), v.rend());
    for (int i = 0; i < v.size(); i++){
        sum += v[i];
        count++;
        if (sum > total - sum){
            break;
        }
    }
    cout << count;
}