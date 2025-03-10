n,m = input().split()
matrix = [list(input().split()) for i in range(int(n))]
k = int(input())

table = [[0] * int(m) for i in range(int(n))]

table[0][0] = 1

for i in range(int(n)):
    for j in range(int(m)):
        if i > 0 and matrix[i][j] >= matrix[i-1][j]:
            table[i][j] += table[i-1][j]
        
        if j > 0 and matrix[i][j] >= matrix[i][j-1]:
            table[i][j] += table[i][j-1]

answer_matrix = []

print(table)

for i in range(int(n)):
    for j in range(int(m)):
        if table[i][j] == k:
            answer_matrix.append((i,j))
            
if answer_matrix:
    for i in answer_matrix:
        print(i)
else:
    print("NO")

# def count_ways(n, m, grid, k):
#     dp = [[0] * m for _ in range(n)]
#     for i in range(n):
#         for j in range(m):
#             if i + 1 < n and grid[i+1][j] >= grid[i][j]:
#                 if dp[i][j] == 0:
#                     dp[i+1][j] +=1
#                 else:
#                     dp[i+1][j] += dp[i][j]+1
#             if j + 1 < m and grid[i][j+1] >= grid[i][j]:
#                 if dp[i][j] == 0:
#                     dp[i][j+1] +=1
#                 else:
#                     dp[i][j+1] += dp[i][j]+1
#     result = []
#     for i in range(n):
#         for j in range(m):
#             if dp[i][j] == k:
#                 result.append((i, j))
    
#     # Output result
#     if result:
#         for cell in result:
#             print(cell[0], cell[1])
#     else:
#         print("NO")


# n, m = map(int, input().split())
# grid = [list(map(int, input().split())) for _ in range(n)]
# k = int(input())




# # Run the function
# count_ways(n, m, grid, k)