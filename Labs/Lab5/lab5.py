class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right
    
    def isValidBST(self, root):
        def valid(curr, lower, upper):
            if not curr: 
                return True

            if lower >= curr.val or upper <= curr.val:
                return False

            return (valid(curr.left, lower, curr.val) and valid(curr.right, curr.val, upper))

        return valid(root, float("-inf"), float("inf"))