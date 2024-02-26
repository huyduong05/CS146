Same methods used for Java and Python

Logic: 

If we are able to count the amount of pairs (of same characters) in the string, 
then we are able to collect all the characters that make a palindrome and 
calculate the max length of the palindrome. 


Execution: 
- initilize a counter that keeps track of the amount of characters in the palidrome
- create a set of characters
- utilize a for loop to interate through the string
    - if the character is in the set, then increment the count by 2 and remove the character from the set
    - if the character is not in the set, then we add it to the set
- after we count up all the pairs in the string, we can check if we can add another character to the palindrome and increment count accordingly
- return count
