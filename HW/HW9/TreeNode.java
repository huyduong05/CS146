package HW.HW9;

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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;

        while (node != null) { 
            if (p.val > node.val && q.val > node.val) { 
                node = node.right;
            } else if (p.val < node.val && q.val < node.val) { 
                node = node.left;
            } else { 
                return node;
            }
        }
        return node;
    } 
    public static void main(String[] args) {
        
    }

}
