def longestPalindrome(self, s: str) -> int:
    count = 0
    hset = set()

    for c in s: 
        if c in hset: 
            count += 2
            hset.remove(c)
        else: 
            hset.add(c)
        
    if len(hset) > 0: 
        count += 1

    return count