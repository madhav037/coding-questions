def hamming_distance(s1, s2):
    return sum(c1 != c2 for c1, c2 in zip(s1, s2))

total_test_cases = int(input())
hamming_cost = []

for i in range(total_test_cases):
    binary_string = input().strip()
    costs = input().split(" ")
    
    if len(costs) != 2 or not all(c.isdigit() for c in costs):
        hamming_cost.append("INVALID")
        continue
    A, B = int(costs[0]), int(costs[1])
    
    if not all(c in "01" for c in binary_string):
        hamming_cost.append("INVALID")
        continue
    
    no_of_01 = sum(binary_string[i:i+2] == "01" for i in range(len(binary_string) - 1))
    no_of_10 = sum(binary_string[i:i+2] == "10" for i in range(len(binary_string) - 1))
    
    original_cost = no_of_01 * A + no_of_10 * B

    rearranged_0_first = "0" * binary_string.count("0") + "1" * binary_string.count("1")
    rearranged_1_first = "1" * binary_string.count("1") + "0" * binary_string.count("0")
    
    hamming_0_first = hamming_distance(binary_string, rearranged_0_first)
    hamming_1_first = hamming_distance(binary_string, rearranged_1_first)

    min_hamming = min(hamming_0_first, hamming_1_first)
    
    hamming_cost.append(min_hamming)

# printing results
for cost in hamming_cost:
    print(cost)
