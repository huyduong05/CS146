Java and Python use the same techinque. 

Logic: To do a level order transversal, you would use breadth first search. 

Procedure: 
1. Initialize a list to hold the result and a queue
2. Add the root to the queue
3. Utilize a while loop so that executes while there are nodes in the queue
    - create a list that will hold all the nodes in that level
    - utilize a for loop to visit each node in the queue at the start of the for loop and add to level list
    - if any visited nodes have children, then add them to the queue
    - add the level list to the result
4. return result

note: each iteration of the while loop is a level in the tree