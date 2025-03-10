# # Input initial balance and number of transactions
# initial_balance = int(input())
# current_balance = initial_balance
# committed_balance = initial_balance
# transaction_queue = []  # Stores all active transactions (credit/debit)
# commit_queue = [initial_balance]  # Stores all committed balances
# num_transactions = int(input())

# # Process each transaction
# for _ in range(num_transactions):
#     transaction = input().strip()

#     if transaction == "read":
#         # Print the current balance when 'read' is encountered
#         print(current_balance)

#     elif transaction == "commit":
#         # Commit the current balance and clear the transaction queue
#         committed_balance = current_balance
#         commit_queue.append(committed_balance)
#         transaction_queue.clear()

#     else:
#         # Split the operation into command and number
#         op, num = transaction.split()
#         num = int(num)

#         if op == "credit":
#             # Add the amount to the balance and track it in the transaction queue
#             current_balance += num
#             transaction_queue.append((op, num))

#         elif op == "debit":
#             # Subtract the amount from the balance and track it in the transaction queue
#             current_balance -= num
#             transaction_queue.append((op, num))

#         elif op == "abort":
#             # Undo the specified transaction if it exists in the queue
#             transaction_index = num - 1
#             if 0 <= transaction_index < len(transaction_queue):
#                 transaction_type, amount = transaction_queue[transaction_index]
#                 if transaction_type == "credit":
#                     current_balance -= amount
#                 elif transaction_type == "debit":
#                     current_balance += amount
#                 transaction_queue.pop(transaction_index)

#         elif op == "rollback":
#             # Rollback to the balance after the specified commit
#             commit_index = num - 1
#             if 0 <= commit_index < len(commit_queue):
#                 current_balance = commit_queue[commit_index]
#                 committed_balance = current_balance
#                 transaction_queue.clear()


current_balance = int(input())
num_operations = int(input())

transaction_values = []  
committed_balances = []  
transaction_status = []  
operations = []  

for _ in range(num_operations):
    operation = input().split(" ")
    operations.append(operation)

for operation in operations:
    if operation[0] == 'read':
        print(current_balance)
    elif operation[0] == "commit":
        committed_balances.append(current_balance)
        transaction_status = [0] * len(transaction_status)
    else:
        operation[1] = int(operation[1])

        if operation[0] == "credit":
            current_balance += operation[1]
            transaction_values.append(operation[1])
            transaction_status.append(1)  

        elif operation[0] == "debit":
            current_balance -= operation[1]
            transaction_values.append(-operation[1])
            transaction_status.append(1)  

        elif operation[0] == "abort":
            transaction_index = operation[1] - 1
            if transaction_status[transaction_index] == 1:
                current_balance -= transaction_values[transaction_index]
                transaction_values[transaction_index] = 0

        elif operation[0] == "rollback":
            commit_index = operation[1] - 1
            current_balance = committed_balances[commit_index]
