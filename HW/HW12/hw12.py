from typing import List

class Solution:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        parents = list(range(n + 1))

        def find(x):
            if x != parents[x]:
                parents[x] = find(parents[x])

            return parents[x]
        
        def union(x, y):
            r1 = find(x)
            r2 = find(y)

            if r1 != r2:
                parents[r2] = r1
                return True
            
            return False

        edges = []

        for u, v, c in pipes:
            edges.append((c, u - 1, v -1))

        # build dummy edges from each house to the dummy node n
        for i, c in enumerate(wells):
            edges.append((c, i, n))
        
        edges.sort()
        ans = 0

        for c, u, v in edges:
            if union(u, v):
                ans += c

        return ans


n = 2
wells = [1, 1]
pipes = [[1,2,1],[1,2,2]]

x = Solution

test = x.minCostToSupplyWater(x, n, wells, pipes)

print(test)