package Labs.Lab4;

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

    public TreeNode invertTree(TreeNode root) {
        
        if (root == null) { 
            return root; 
        } else { 
            TreeNode rightTemp = root.right; 
            root.right = root.left;
            root.left = rightTemp; 

            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
        }

        return root; 
    }

 }

 