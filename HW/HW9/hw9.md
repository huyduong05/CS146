Java and Python use the same approach. 

Logic: The lowest common ancestor of p and q are found when p > currentNode > q 
or p < currentNode < q. Once that is true, currentNode is the LCA. 

Process: 

1. Initialize currentNode variable that is initially = root
2. Utilizing a while loop
    - if p & q > currentNode, then set currentNode = currentNode.right (right is a common ancestor of p & q)
    - else if p & q <> currentNode, then set currentNode = currentNode.left (left is a common ancestor of p & q)
    - else: the common ancestor is found
