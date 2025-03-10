def bank_account_operations(initial_balance, operations):
    balance = initial_balance
    transactions = []  
    commits = [] 

    output = []
    for operation in operations:
        if operation[0] == "read":
            output.append(balance)
        elif operation[0] == "credit":
            amount = int(operation[1])
            balance += amount
            transactions.append(("credit", amount))
        elif operation[0] == "debit":
            amount = int(operation[1])
            balance -= amount
            transactions.append(("debit", amount))
        elif operation[0] == "abort":
            index = int(operation[1]) - 1
            if index < len(transactions): 
                trans_type, amount = transactions[index]
                if trans_type == "credit":
                    balance -= amount
                elif trans_type == "debit":
                    balance += amount
                transactions.pop(index)
        elif operation[0] == "rollback":
            commit_index = int(operation[1]) - 1
            if commit_index < len(commits):
                balance = commits[commit_index]
                transactions = []
        elif operation[0] == "commit":
            commits.append(balance)
            transactions = []

    return output

def main():
    initial_balance = int(input().strip())
    num_operations = int(input().strip())
    operations = [input().strip().split() for _ in range(num_operations)]
    results = bank_account_operations(initial_balance, operations)
    for result in results:
        print(result)

if __name__ == "__main__":
    main()
