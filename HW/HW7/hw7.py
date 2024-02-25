from typing import List

class hw2: 
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:   
        
        start = []
        end = [] 
        
        for i in range(len(intervals)):
            start.append(intervals[i][0])
            end.append(intervals[i][1])

        start.sort()
        end.sort()

        result = 0
        count = 0

        l = 0
        r = 0

        while l < len(intervals):
            if start[l] < end[r]: 
                count += 1
                l += 1
            else:
                count -= 1
                r += 1
            result = max(result, count)

        return result

x = hw2()

test1 = ( [0,30],[5,10],[15,20] )
test2 = ( [0, 1], [1, 2], [2, 3] )
test3 = ( [7, 10], [2, 4] )

print("Test 1: ", x.minMeetingRooms(test1))
print("Test 2: ", x.minMeetingRooms(test2))
print("Test 3: ", x.minMeetingRooms(test3))


