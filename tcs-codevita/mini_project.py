# initial_balance = int(input())
# current_balance = initial_balance
# commited_amount = initial_balance
# transaction_queue = []
# commit_queue = []
# transactions = int(input())

# while transactions > 0:
#     transaction = input()
#     if transaction == "read":
#         print(current_balance)
#     elif transaction == "commit":
#         current_balance = commited_amount
#         transaction_queue = []
#         commit_queue.append(commited_amount)    
#     else:
#         op, num = transaction.split()  
#         num = int(num)  
#         if op == "credit":
#             commited_amount += num
#             transaction_queue.append((op, num))
#         elif op == 'debit':
#             commited_amount -= num
#             transaction_queue.append((op, num))
#         elif op == 'abort':
#             if len(transaction_queue) > num - 1 >= 0:
#                 num -= 1
#                 if transaction_queue[num][0] == 'credit':
#                     commited_amount -= transaction_queue[num][1]
#                 else:
#                     commited_amount += transaction_queue[num][1]
#             # transaction_queue.pop(num)
#         elif op == 'rollback':  
#             if len(commit_queue) > num - 1 >= 0:
#                 num -= 1
#                 commited_amount = commit_queue[num]
#                 transaction_queue = []
#     transactions -= 1

balance = int(input())
transactions = int(input())

arr = []
commit = []
transaction = []
data = []
for i in range(transactions):
    s = input()
    s = s.split(" ")
    data.append(s)

for s in data:
    if s[0] == 'read':
        print(balance)
        continue
    elif s[0] == "commit":
        commit.append(balance)

        for i in range(len(transaction)):
            transaction[i] = 0
        continue
    
    s[1] = int(s[1])

    if s[0] == "credit":
        balance += s[1]
        arr.append(s[1])
        transaction.append(1)

    elif s[0] == "debit":
        balance -= s[1]
        arr.append(s[1]*-1)
        transaction.append(1)

    elif s[0] == "abort":
        if transaction[s[1]-1] == 1:
            balance -= arr[s[1]-1]
            arr[s[1]-1] = 0

    elif s[0] == "rollback":
        balance = commit[s[1]-1]