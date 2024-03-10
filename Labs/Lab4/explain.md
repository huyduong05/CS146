Java and Python Approaches are the same.

1. Check if root == null, this tells us that there are no more swaps possible and we just return root without any changes
2. Swap the right and left children nodes
3. Recursively call invertTree to invert the right and left subtrees

Reasoning: We keep swapping right and left children until they are null (making it not possible to swap them anymore). This leads to an inverted tree. 