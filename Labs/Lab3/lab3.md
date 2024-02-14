Problem 1:

1. 10000000000n^2 vs n^3
    n^3 is asymptotically greater because the n^3 is to a higher degree than 10000000000n^2. 


2. n^2 log(n) vs n(log(n))^10
    n^2log(n) is asymptotically greater because by logarithmic rules, it boils down to 2logn > logn.


3. n^(logn) vs 2^(√n) 
    log(logn) 		    (√n)log2
    log((logn)^2)		log(√nlog2)
    2log(logn)		    log(√n) + log(log2)
    
    n^(logn) is asymptomatically greater 


4. 2^n vs 2^(2n)
    2^(2n) is asymptomatically greater because 2n > n



Problem 2: 

Best case: 
    - If n is even 
    - Constant runtime
    - O(1)

Worst case:
    - If n a prime number
    - Sqrt runtime
    - O(√n)

Average case: 
    - O(√n)

