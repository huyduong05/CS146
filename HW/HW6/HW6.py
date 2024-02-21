from typing import List


def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        result = set()

        if (nums[0] > 0):
            return result
            
        for i in range(n): 
            if (nums[i] > 0):
                break
            
            l = i + 1
            r = n - 1

            while (l < r): 
                total = nums[i] + nums[l] + nums[r]
                if total == 0:
                    result.add(tuple((nums[i], nums[l], nums[r])))
                    l += 1
                    r -= 1
                elif total < 0: 
                    l += 1            
                else:
                    r -= 1
                
        return list(result)
