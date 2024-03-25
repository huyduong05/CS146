from ast import List
from collections import deque


def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adjList = { i: [] for i in range(numCourses)}
        indegree = [0] * numCourses

        for course, pre in prerequisites:
            adjList[pre].append(course)
            indegree[course] += 1

        q = deque()

        for i in range(numCourses):
            if indegree[i] == 0:
                q.append(i)

        result = []
        
        while (len(q) > 0):
            pop = q.popleft()
            result.append(pop)

            if (adjList[pop]):
                for x in adjList[pop]:
                    indegree[x] -= 1

                    if indegree[x] == 0:
                        q.append(x)
        
        if len(result) == numCourses:
            return True
        else:
            return False

