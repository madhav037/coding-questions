#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

// Function to calculate the Hamming distance between two binary strings
int hamming_distance(const string &s1, const string &s2) {
    int distance = 0;
    for (int i = 0; i < s1.size(); ++i) {
        if (s1[i] != s2[i]) {
            ++distance;
        }
    }
    return distance;
}

int main() {
    int total_test_cases;
    cin >> total_test_cases;
    vector<string> hamming_cost;

    for (int t = 0; t < total_test_cases; ++t) {
        string binary_string;
        cin >> binary_string;

        string cost_input;
        cin.ignore(); 
        getline(cin, cost_input);

        int A, B;
        size_t space_pos = cost_input.find(' ');
        if (space_pos != string::npos) {
            try {
                A = stoi(cost_input.substr(0, space_pos));
                B = stoi(cost_input.substr(space_pos + 1));
            } catch (...) {
                hamming_cost.push_back("INVALID");
                continue;
            }
        } else {
            hamming_cost.push_back("INVALID");
            continue;
        }

        bool valid_binary = all_of(binary_string.begin(), binary_string.end(),
                                   [](char c) { return c == '0' || c == '1'; });
        if (!valid_binary) {
            hamming_cost.push_back("INVALID");
            continue;
        }

        int no_of_01 = 0, no_of_10 = 0;
        for (size_t i = 0; i < binary_string.size() - 1; ++i) {
            if (binary_string.substr(i, 2) == "01") ++no_of_01;
            if (binary_string.substr(i, 2) == "10") ++no_of_10;
        }

        int original_cost = no_of_01 * A + no_of_10 * B;

        string rearranged_0_first(binary_string.size(), '0');
        fill(rearranged_0_first.begin() + binary_string.size() - count(binary_string.begin(), binary_string.end(), '1'), rearranged_0_first.end(), '1');

        string rearranged_1_first(binary_string.size(), '1');
        fill(rearranged_1_first.begin() + binary_string.size() - count(binary_string.begin(), binary_string.end(), '0'), rearranged_1_first.end(), '0');

        int hamming_0_first = hamming_distance(binary_string, rearranged_0_first);
        int hamming_1_first = hamming_distance(binary_string, rearranged_1_first);

        int min_hamming = min(hamming_0_first, hamming_1_first);

        hamming_cost.push_back(to_string(min_hamming));
    }

    // Print results
    for (const string &cost : hamming_cost) {
        cout << cost << endl;
    }

    return 0;
}
