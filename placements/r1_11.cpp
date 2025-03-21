/*Write a program to find the maximum amount of money you can rob tonight without alerting the police, given that you cannot rob two adjacent houses.
Input: [2, 7, 9, 3, 1]
Output: 12*/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
  vector<int> nums = {2, 7, 9, 3, 1}; 
  
  int n = nums.size();

  if (n == 0) {
    cout << 0 << endl;
    return 0;
  }

  if (n == 1) {
    cout << nums[0] << endl;
    return 0;
  }

  int rob_prev = nums[0];
  int not_rob_prev = max(nums[0], nums[1]);

  for (int i = 2; i < n; ++i) {
    int current = max(not_rob_prev, rob_prev + nums[i]);
    rob_prev = not_rob_prev;
    not_rob_prev = current;
  }

  cout << not_rob_prev << endl;
}