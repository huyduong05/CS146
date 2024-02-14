Problem 1:

    Best case: 
    - when the list is already sorted (while loop never executes)
    - O(N)

    Worst case:
    - when the list is in reverse order
    - both for loop and nested while loop execute
    - O(N^2)

    Average Case: 
    - when the list is randomly sorted
    - for loop (always) and nested while loop (sometimes) execute
    - O(N^2)


Problem 2 (ORIGINAL pseudocode): 

    Best case: 
    - columns(A) != rows(B)
    - only if statement executes and raises error
    - O(1)

    Worst Case: 
    - when matrix multiplication is possible
    - 2 seperate for loops inside a for loop (2N^2)
    - O(N^2)

    Average Case: 
    - when matrix multiplication is possible
    - 2 seperate for loops inside a for loop (2N^2)
    - O(N^2)

Problem 2 (UPDATED pseudocode): 

    Best case: 
    - columns(A) != rows(B)
    - only if statement executes and raises error
    - O(1)

    Worst Case: 
    - when matrix multiplication is possible
    - for loop inside a for loop inside a for loop executes (N^3)
    - O(N^3)

    Average Case: 
    - when matrix multiplication is possible
    - for loop inside a for loop inside a for loop executes (N^3)
    - O(N^3)



