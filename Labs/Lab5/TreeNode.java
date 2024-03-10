package Labs.Lab5;

public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode curr, long lower, long upper) { 
        if (curr == null) { 
            return true;
        }
        if (!(lower < curr.val && upper > curr.val)) { 
            return false;
        }
        return valid(curr.left, lower, curr.val) && valid(curr.right, curr.val, upper);
    }
    public static void main(String[] args) {
        
    }
 }