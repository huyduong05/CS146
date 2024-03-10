Same approach for Java and Python

Logic: 
In a BST each node has an lower and upper bound to be able to follow BST properties. 
If we iterate through BST and check to make sure each node is within its lower and upper bounds, then we can check the validity of the tree. 

Procedure: 
1. create a recursive helper function (valid) that has the parameters: Node curr, long lower, long upper
    - first check if curr == null, the BST property is valid with null nodes
    - next check if curr follows the BST property, return false if it doesn't
    - recursively call valid for the left and right nodes with updated bounds respectfully and return true if both are true. 

2. in isValidBST, return valid(root, -inf, inf). Since the root can be any number, the original upper and lower bounds are -infinity and infinity. 
