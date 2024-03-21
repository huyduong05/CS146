Assignment: "Everything Everywhere All At Once" 
Name: Huy Duong

## Given an adjacency list, how can you convert it to an adjacency matrix? 
 
psuedocode:
    listToMatrix(list): 
        matrix = [][]

        for each vertex in list: 
            for each connectedVertex in vertex: 
                matrix[vertex][connectedVertex] = T or 1 or weight

        fill in empty boxes with F or null or 0 or whatever you want to use

        return matrix

explaination: 
    Each list in the edge list can be turned into coordinates. 
    For example 1 would be the x coordinate and all of it's connected nodes are it's y coordinate,
    So 1 -> 2, 3, 4, 5 could be turned into (1, 2) (1, 3) (1, 4) (1, 5). 
    We can use those coordinates to create an adjacency matrix. 

before (adjaceny list): 
    1 -> 2, 3, 4, 5
    2 -> 4
    3 -> 1, 2
    4 -> 3
    5 -> 3, 4 

after (adjaceny matrix): 
        1   2   3   4   5   
    1   T   T   T   T   T
    2   F   F   F   T   F
    3   T   T   F   F   F
    4   F   F   T   F   F
    5   F   F   T   T   F


## Given an adjacency matrix, how can you convert it to an adjacency list? 

psuedocode: 
    matrixToList(matrix): 
        list = [][]

        for i in matrix: 
            for j in i: 
                if (matrix[i][j] == T or 1 or weight): 
                    list[i].append(j)

        return list

explaination: 
    Each of the (i, j) pairs in the matrix tells us that i vertex connects to j vertex. 
    Using that logic, we can add all of the j vertexs that connect to i vertex within i vertex's list.
    So (1, 2) (1, 3) (1, 4) (1, 5) could be turned into 1 -> 2, 3, 4, 5.
    - the i vertex is 1
    - the j vertexes are 2, 3, 4, 5
    - the i vertex's list contains it's j vertexes

before (adjaceny matrix):
        1   2   3   4   5   
    1   T   T   T   T   T
    2   F   F   F   T   F
    3   T   T   F   F   F
    4   F   F   T   F   F
    5   F   F   T   T   F

after (adjaceny list):  
    1 -> 2, 3, 4, 5
    2 -> 4
    3 -> 1, 2
    4 -> 3
    5 -> 3, 4 


## Given a directed graph, how can you reverse the direction of each edge? 

pseudocode (matrix): 
    reverseGraph(matrix):
        for i in range(matrix.len)
            for j in range(matrix[i].len)
                temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp

explaination(matrix): 
    In a an adjacency matrix in (x, y) form, the x vertex has a outgoing edge to the y vertex.
    If we swap the (x, y) -> (y,x), then the y vertex will have a outgoing edge to the x vertex. 
    That will the reverse the direction of each edge. 
    To do that we use nested for loops to iterate through matrix and swap matrix[i][j] -> matrix[j][i]. 

pseudocode (list):
    reverseList(list):
        reverseList = [][]

        for i in matrix: 
            for j in i: 
                reverseList[j].append(i)

        list = reverseList or return reverseList

explaination(list): 
    In an adjacency list, each vertex has a list of its outgoing edges to another vertex. 
    To reverse the directions of each node, we switch each outgoing edge to an incoming edge.
    To do this we add i vertex to each of its j vertexs lists. 
    for example: 1 -> 2, 3, 4, 5
    - add 1 to each 2, 3, 4, 5 lists
    - input: 1 -> 2, 3, 4, 5
    - output: 2 -> 1, 3 -> 1, 4 -> 1, 5 -> 1
