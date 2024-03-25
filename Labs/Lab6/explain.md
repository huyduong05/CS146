The same approach is used for Java and Python.

Initution:
    A topological sort would be able to show the order of courses to finish all the courses.
    If a topolocial sort is unable to be completed, then that means it is not possible to take all the courses. 

Procedure:
1. Utilize prerequites to create an adjacency list and an indegree array that keeps track of the indegrees
2. Perform Kahn's Algorithm with the indegree array and adjacency list. 
3. Return if the result array length == numCourses 


