def bank_operations(initial_balance, operations):
    balance = initial_balance
    transactions = []
    commits = []
    rollback_balances = []

    for operation in operations:
        op = operation.split()
        if op[0] == 'read':
            print(balance)
        elif op[0] == 'credit':
            transactions.append(('credit', int(op[1])))
            balance += int(op[1])
        elif op[0] == 'debit':
            transactions.append(('debit', int(op[1])))
            balance -= int(op[1])
        elif op[0] == 'abort':
            index = int(op[1]) - 1
            if index < len(transactions) and index >= len(commits):
                if transactions[index][0] == 'credit':
                    balance -= transactions[index][1]
                elif transactions[index][0] == 'debit':
                    balance += transactions[index][1]
                del transactions[index]
        elif op[0] == 'rollback':
            index = int(op[1]) - 1
            if index < len(rollback_balances):
                balance = rollback_balances[index]
                transactions = transactions[:index+1]
        elif op[0] == 'commit':
            commits.append(len(transactions))
            rollback_balances.append(balance)

# Input Example
initial_balance = int(input())
n_operations = int(input())
operations = [input().strip() for _ in range(n_operations)]

# Process operations
bank_operations(initial_balance, operations)
