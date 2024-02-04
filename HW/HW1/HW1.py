# brute force (two for loops)
def isPalindrome1(s:str) -> bool: 
    s = s.lower()
    editted = ""

    for c in s:
        if c.isalnum():
            editted += c
        
    for i in range(len(editted) // 2):
        if not editted[i] == editted[len(editted) - i - 1]: 
            return False
    
    return True


# two pointer
def isPalindrome2(s: str) -> bool:
    p1 = 0
    p2 = len(s) - 1
    s = s.lower()

    while (p1 < p2):
        if not s[p1].isalnum():
            p1 += 1
        elif not s[p2].isalnum():
            p2 -= 1
        elif s[p1] == s[p2]:
            p1 += 1
            p2 -= 1
        else: 
            return False
        
    return True


words = ["racecar", "palindrome", "a!1b,,,,:::#b@1a"]

for x in words:
    print(isPalindrome1(x))
    print(isPalindrome2(x))