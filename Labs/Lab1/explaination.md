I used the same methods for both languages

Components: 
    HashMap that has a int key and int value
        key - nums[i]
        value - i
    for loop to iterate through nums. 
    int difference which is target - nums[i]

Strategy: 
    I insert elements into the HashMap with key = nums[i] and value = i, using the for loop. Also within the for loop, I check if int difference is already in the HashMap or not. If it is already within the HashMap, that means I have found my two numbers that add up to target (difference and nums[i]). Difference is a key that points to its index in nums. While i is the index of nums[i]. This allows me to return the indexs of the two numbers in nums that add up to target. 
    

