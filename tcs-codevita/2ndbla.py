def find_min_orbs(potion, recipes, memo):
    if potion in memo:
        return memo[potion]
    
    if potion not in recipes:
        return 0
    
    min_orbs = float('inf')  
    
    for ingredients in recipes[potion]:
        current_orbs = len(ingredients) - 1  
        for ingredient in ingredients:
            current_orbs += find_min_orbs(ingredient, recipes, memo)  
        
        min_orbs = min(min_orbs, current_orbs)
    
    memo[potion] = min_orbs
    return min_orbs


N = int(input()) 
recipes = {}  

for _ in range(N):
    line = input().strip()
    potion, ingredients = line.split('=')
    potion = potion.strip()
    ingredients = ingredients.strip().split('+')
    ingredients = [ingredient.strip() for ingredient in ingredients]
    
    if potion not in recipes:
        recipes[potion] = []
    recipes[potion].append(ingredients)

target_potion = input().strip()

memo = {}

result = find_min_orbs(target_potion, recipes, memo)

print(result)
