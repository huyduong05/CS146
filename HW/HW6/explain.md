Java (HashMap): 

    Data Structures: 
    - result (ArrayList)
    - map (HashMap)

    1. nums gets sorted in ascending order (least to greatest)
        - Since nums is sorted, if nums[i] > 0 then there aren't any more possible triplets for i -> nums.length - 1
    2. Check for base case: nums[0] > 0, prevents unnessary runtime
    3. Build map by using key: nums[i] and value: i
    4. Utilize a nested for loop to get 2/3 of the triplets (nums[i] + num[j]) and check if the third possible triplet is within nums using the HashMap. 
        - possible third triplet = needed = -1 * (nums[i] + num[j])
        - conditions for valid 3rd triplet: key is in map and value > j 
            - prevents duplicate triplets
        - if conditions are met, add [nums[i], nums[j], needed] to result
    5. return result

    Logic: 
    - The hashmap allows us to easily check if the third triplet is within num, without additional transversal needed
    

Python (two-pointer): 

    Data Structures: 
    - result (set)

    1. nums gets sorted in ascending order (least to greatest)
        - Since nums is sorted, if nums[i] > 0 then there aren't any more possible triplets for i -> nums.length - 1
    2. Check for base case: nums[0] > 0, prevents unnessary runtime
    3. Utilize a for loop, two pointers, and a while loop.
        - i = (0, len(nums)), l = left pointer = i + 1, r = right pointer = len(nums) - 1 
        - check if nums[i] + nums[l] + nums[r] == 0
            - if condition met, add tuple(nums[i], nums[l], nums[r]) to result
        - increment for loop and pointers accordingly

    Logic: 
    - using a set and tuples within the set make sure there aren't any duplicates
    - the two pointers allow us to efficiently check for triplets from i to len(nums) - 1
    - conditional (nums[i] > 0) allow the algorithm to break earlier (when there are no more possible triplets), improves efficiency