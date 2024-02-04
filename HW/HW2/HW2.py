def firstBadVersion(n):
    low = 1
    high = n

    while (low < high):
        mid = low + (high - low) // 2
        if (isBadVersion(mid)):
            high = mid
        else:
            low = mid + 1
    
    return low

def isBadVersion(n):
    match n:
        case 1 :
                return False
        case 2 : 
            return False
        case 3 : 
            return False
        case 4 :
            return True
        case 5 : 
            return True
        case 6 : 
            return True
        case 7: 
            return True

    return False

print(firstBadVersion(7))
print(firstBadVersion(6))
print(firstBadVersion(5))
print(firstBadVersion(4))
