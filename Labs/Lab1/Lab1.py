def twoSum(nums, target):
    map = {}
    n = len(nums)

    for i in range(n): 
        difference = target - nums[i]
        if difference in map:
            return [map[difference], i]
        map[nums[i]] = i
    
    return []
    
arr1 = [2, 7, 11, 15]
print("Test 1:", twoSum(arr1, 9))

arr2 = [3, 2, 4]
print("Test 2:", twoSum(arr2, 6))

arr3 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print("Test 3:", twoSum(arr3, 17))