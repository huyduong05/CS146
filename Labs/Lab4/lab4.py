from contextlib import nullcontext


class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

    def invertTree(self, root):
        if (root == None): 
            return root
        else:
            temp = root.right
            root.right = root.left
            root.left = temp

            root.left = self.invertTree(root.left)
            root.right = self.invertTree(root.right)

        return root
        
        