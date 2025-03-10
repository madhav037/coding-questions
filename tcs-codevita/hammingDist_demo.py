total_test_cases = int(input())
inputs = []
hamming_cost = []

# getting inputs
for i in range(total_test_cases):
    binary_string = input()
    costs = input().split(" ")
    if len(costs) != 2 or not all(c in "0123456789" for c in costs):
        hamming_cost.append("INVALID")
        continue
    
    if not all(c in "01" for c in binary_string):
        hamming_cost.append("INVALID")
        continue
    
    no_of_01 = binary_string.count("01")
    no_of_10 = binary_string.count("10")
    original_cost = no_of_01 * costs[0] + no_of_10 * costs[1]
    
    rearrange_cost_0 = costs[0]
    rearrange_cost_1 = costs[1]
    if binary_string.count("0") == 0 or binary_string.count("1") == 0:
        rearrange_cost_0 = 0
        rearrange_cost_1 = 0
    
    rearrange_final = rearrange_cost_0 if rearrange_cost_0 < rearrange_cost_1 else rearrange_cost_1  
    hamming_cost.append(min(rearrange_final,original_cost))
    
# printing results
for i in hamming_cost:
    print(i)