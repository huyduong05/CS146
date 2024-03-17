package HW.HW10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        ArrayList<List<Integer>> result = new ArrayList<>();

        q.add(root);

        while (q.size() > 0) { 
            int queueLength = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < queueLength; i++) { 
                TreeNode node = q.poll();
                if (node != null) {
                    level.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if (level.size() > 0) {
                result.add(level);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
    }

 }
