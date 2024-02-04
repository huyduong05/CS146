I used two approaches in both python and java.

First approach (two for loops): 
    I utilized two for loops. The first for loop iterated through String s and added all the characters that were 
    digits or letters to a new String called editted. This allowed me to get rid of the non alphanumeric characters.
    I used the second for loop to check if first and last letter in editted were the same and incremented it so that 
    editted's charAt(i) and charAt(len - i - 1) were checked at each iteration of the for loop until it reached the 
    center of the word. If the whole for loop was able to iterate, it would mean that the string is a valid palindrome.

Second approach(two pointers):
    I initialized two int variables (p1 and p2) that are the indexs for the two pointers. I utilized a while loop what 
    would run while p1 < p2. Within the while loop, I would increment p1 and p2 with 2 conditions: if s.charAt p1 or p2 
    were not alphanumeric characters; if s.charAt(p1) == s.charAt(p2). If s.charAt(p1) != s.charAt(p1), then the program 
    would return false. If p1 >= p2, then the program would return true. This essentially would check if String s was 
    a palindrome by skipping over non alphanumeric characters. 


Note: For both approaches, I set String s to lowercase in the beginning