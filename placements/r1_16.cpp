// Given an integer array nums, return the length of the longest strictly increasing subsequence.The longest increasing subsequence is [10, 9, 2, 5, 3, 7, 101, 18], with a length of 4.

#include<iostream>
#include<vector>
#include <algorithm>

using namespace std;

// O(n^2)
int largest_increasing_subsequence(vector<int>& arr){
	int length = 1;
	for (int i = 0; i < arr.size(); i++) {
		int j = i+1, curr_length = 1, temp = i;
		while(j < arr.size()){
			if (arr[temp] < arr[j]) {
					temp = j;
					curr_length++;
			}
			j++;
		}
		length = max(length, curr_length);

	}
	return length;
}

// O(n log n)
int largest_increasing_subsequence_op(vector<int>& arr) {
    vector<int> lis;

    for (int num : arr) {
        auto it = lower_bound(lis.begin(), lis.end(), num);
        if (it == lis.end()) {
            lis.push_back(num);
        } else {
            *it = num;
        }
    }

    return lis.size();
}


int main() {
	vector<int> arr = {10, 9, 2, 5, 3, 7, 101, 18};
	cout << largest_increasing_subsequence(arr);
}