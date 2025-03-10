class Cube:
    def _init_(self,v):
        self.val = v
        self.top = None
        self.down = None
        self.right = None
        self.left = None

    def check(self,first,second,direction):
        if direction == 'left':

            if first.left != None:
                if first.left.down != None:
                    second.down = first.left.down
                    first.left.top = second
                
                if first.left.top != None:
                    second.top = first.left.top
                    first.left.top.down = second

                if first.left.left != None:
                    second.left = first.left.left
                    first.left.left.right = second

            first.left = second
            second.right = first

            if first.top != None and second.top != None:
                first.top.left = second.top
                second.top.right = first.top

            if first.down != None and second.down != None:
                first.down.left = second.down
                second.down.right = first.down

        elif direction == 'right':

            if first.right != None:
                if first.right.down != None:
                    second.down = first.right.down
                    first.right.top = second
                
                if first.right.top != None:
                    second.top = first.right.top
                    first.right.top.down = second

                if first.right.right != None:
                    second.right = first.right.right
                    first.right.right.left = second

            first.right = second
            second.left = first

            if first.top != None and second.top != None:
                first.top.right = second.top
                second.top.left = first.top
            
            if first.down != None and second.down != None:
                first.down.right = second.down
                second.down.left = first.down

        elif direction == 'top':

            if first.top != None:
                if first.top.right != None:
                    second.right = first.top.right
                    first.top.right.left = second
                
                if first.top.left != None:
                    second.left = first.top.left
                    first.top.left.right = second

                if first.top.top != None:
                    second.top = first.top.top
                    first.top.top.down = second

            first.top = second
            second.down = first

            if first.right != None and second.right != None:
                first.right.top = second.right
                second.right.down = first.right
            
            if first.left != None and second.left != None:
                first.left.top = second.left
                second.left.down = first.left

        elif direction == 'down':

            if first.down != None:
                if first.down.right != None:
                    second.right = first.down.right
                    first.down.right.left = second
                
                if first.down.left != None:
                    second.left = first.down.left
                    first.down.left.right = second

                if first.down.down != None:
                    second.down = first.down.down
                    first.down.down.top = second

            first.down = second
            second.top = first

            if first.right != None and second.right != None:
                first.right.down = second.right
                second.right.top = first.right
            
            if first.left != None and second.left != None:
                first.left.down = second.left
                second.left.top = first.left
    

n = int(input())

arr = []

for i in range(n):
    s = input()
    s = s.split(" ")
    s[0], s[1] = int(s[0]), int(s[1])

    flag1 = 0
    flag2 = 0

    c1 = None
    c2 = None

    for j in arr:
        if j.val == s[0]:
            c1 = j
            flag1 = 1
        
        if j.val == s[1]:
            c1 = j
            flag2 = 1
    
    if flag1 == 0:
        c1 = Cube(s[0])
        arr.append(c1)
    if flag2 == 0:
        c2 = Cube(s[1])
        arr.append(c2)
        
    Cube.check(0, c1, c2, s[2])
    
