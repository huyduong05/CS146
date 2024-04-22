The same approach is used for Java and Python.

Intuition: 
    As explained in a class, a greedy approach isn't possible. We can do an exhaustive search to find out all the possible coin combinations for each coin amount. To save time, we can store the optimal values of each coin amount leading up to the desired amount. We can do this via memoization. With an exhaustive search and memoization, we can find the fewest number of coins needed to make the amount. 

Procedure:
1. Initialize a DP array with size amount + 1, make sure the values in the array are greater than the most optimal solution (dp[1 -> amoount + 1] = amount + 1)
2. Iterate through the array from range 1 to amount + 1
    3. Iterate through the coin amounts:
        4. if it is possible to substract c from the array, then update dp array as needed
5. return dp[amount] or -1 if there is no solution