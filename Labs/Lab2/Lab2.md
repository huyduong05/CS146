<!-- Assuming String s and String t both consist of lowercase letters -->

Java: 
    This approach uses two HashMaps (map1 and map2) with chars as keys and ints as values. 
    First the program checks if len(s) == len(t)
    Next a single for loop iterates through both String s and t. 
    Within the loop, we add the keys s.charAt(i) and t.charAt(i) to map1 and map2 respectively.
    While the int values of each key are the number of occurences of charAt(i) (starting at 0).
    After the for loop executes, map1 and map2 both contain the chars and the number of occurences for each char in s and t respectively.
    Return map1.equals(map2), this will be true if all the letters in s and t occur the same amount of time, making it an anagram. 

Python: 
    This approach uses a single HashMap/dictionary (counts) with chars as keys and ints as values.
    First the program checks if len(s) == len(t)
    counts is set so that every value is first set to 0 
    There are 3 for loops: 
        1st for loop: iterates through each char in s and increments each occurence of char x in String s and stores the values using the dictionary counts
        2nd for loop: iterates through each char in t and deincrements each occurence of char x in String t and stores the values using the dictionary counts
        3rd for loop: checks if each value in counts is a 0; if a value != 0, then return False
    The logic behind this program is that if every value in counts is 0, that means that each letter in String s and String t occurs the same amount of times, making them anagrams.
    