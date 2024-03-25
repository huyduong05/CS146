## Kahn's Algorithm / BFS:

- Kahn's Algorithm is essentially a BFS because you are going level by level,
in which nodes with the same amount of indegrees are on the same level. 
- adds all nodes with an indegree of 0 to a queue
- loops through, decrements indegrees, adds ints in queue to result until queue is empty

Adjacency List:
    0 -> 1
    1 -> 2, 4
    2 -> 
    3 -> 4
    4 -> 

First Interation:
    Indegree List: 
        0: 0
        1: 1
        2: 1
        3: 0
        4: 2

    Queue: 0 3
    Result: 0 3

Second Interation:
    Indegree List: 
        0: 0
        1: 0
        2: 0
        3: 0
        4: 1

    Queue: 1 2
    Result: 0 3 1 2

Third Interation:
    Indegree List: 
        0: 0
        1: 0
        2: 0
        3: 0
        4: 0

    Queue: 4
    Result: 0 3 1 2 4

Kahn's/BFS Result: 0 3 1 2 4 

## DFS

Adjacency List:
    0 -> 1
    1 -> 2, 4
    2 -> 
    3 -> 4
    4 -> 

Orders needed: 
    0 -> 1 -> 2
    0 -> 1 -> 4
    3 -> 4

Through DFS Transversal:
    3 0 1 4 2
- 3 is before 4
- 0 is before 1
- 1 is before 4
- 1 is before 2
- therefore this is a valid Topological sort