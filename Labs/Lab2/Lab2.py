from collections import defaultdict


def isAnagram(s, t):
    if (len(s) != len(t)): 
        return False
    
    counts = defaultdict(int)
    
    for x in s:
        counts[x] += 1

    for x in t: 
        counts[x] -= 1

    for x in counts.values():
        if x != 0:
            return False

    return True

s = "eat"
t = "tea"
# true
print(isAnagram(s,t))

s = "fried"
t = "fired"
# true
print(isAnagram(s,t))

s = "latte"
t = "late"
# false
print(isAnagram(s,t))

s = "abcdef"
t = "bedcfa"
# true
print(isAnagram(s,t))

