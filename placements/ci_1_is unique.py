# brute force O(n^2)
def is_unique(s : str ):
  for i in range(len(s)):
    for j in range(i,len(s)):
      if s[i] == s[j]:
        return False
  return True


# a bit optimised O(n log n)
def is_unique_op(s: str):
  s = "".join(sorted(s))
  for i in range(len(s)):
    if s[i] == s[i+1]:
      return False
  return True

# In the book O(n)
def is_unique_book(s: str):
  if len(s) > 128 :
    return False

  char_set = [False] * 128

  for i in range(len(s)):
    val = ord(s[i])
    if char_set[val]:
      return False
    char_set[val] = True
  return True