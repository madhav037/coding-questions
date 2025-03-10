class Cube:
    def __init__(self, v):
        self.val = v
        self.top = None
        self.down = None
        self.right = None
        self.left = None

    def check(self, first, second, direction):
        if direction == 'left':
            if first.left:
                if first.left.down:
                    second.down = first.left.down
                    first.left.down.top = second
                if first.left.top:
                    second.top = first.left.top
                    first.left.top.down = second
                if first.left.left:
                    second.left = first.left.left
                    first.left.left.right = second
            first.left = second
            second.right = first

        elif direction == 'right':
            if first.right:
                if first.right.down:
                    second.down = first.right.down
                    first.right.down.top = second
                if first.right.top:
                    second.top = first.right.top
                    first.right.top.down = second
                if first.right.right:
                    second.right = first.right.right
                    first.right.right.left = second
            first.right = second
            second.left = first

        elif direction == 'top':
            if first.top:
                if first.top.right:
                    second.right = first.top.right
                    first.top.right.left = second
                if first.top.left:
                    second.left = first.top.left
                    first.top.left.right = second
                if first.top.top:
                    second.top = first.top.top
                    first.top.top.down = second
            first.top = second
            second.down = first

        elif direction == 'down':
            if first.down:
                if first.down.right:
                    second.right = first.down.right
                    first.down.right.left = second
                if first.down.left:
                    second.left = first.down.left
                    first.down.left.right = second
                if first.down.down:
                    second.down = first.down.down
                    first.down.down.top = second
            first.down = second
            second.top = first

def count_shared_sides(arr):
    shared_sides = 0
    for cube in arr:
        if cube.top:
            shared_sides += 1
        if cube.down:
            shared_sides += 1
        if cube.left:
            shared_sides += 1
        if cube.right:
            shared_sides += 1
    return shared_sides

# Input Handling
n = int(input())  
arr = []

for _ in range(n):
    s = input().split()
    s[0], s[1] = int(s[0]), int(s[1])
    direction = s[2]

    # Find or create cubes
    c1, c2 = None, None
    for cube in arr:
        if cube.val == s[0]:
            c1 = cube
        if cube.val == s[1]:
            c2 = cube

    if not c1:
        c1 = Cube(s[0])
        arr.append(c1)
    if not c2:
        c2 = Cube(s[1])
        arr.append(c2)

    # Connect cubes
    c1.check(c1, c2, direction)

# Calculate and output result
result = count_shared_sides(arr)
print(result)