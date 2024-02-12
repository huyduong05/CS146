def fibonacci(n):

    if (n == 0):
        return 0    
    if (n == 1):
        return 1
    
    past = [0, 1]

    for i in range(1, n):
        
        temp = past[0] + past[1]
        past[0] = past[1]
        past[1] = temp


    return temp

for i in range(11): 
    print(str(fibonacci(i)), end=" ")
