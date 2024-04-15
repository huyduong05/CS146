package HW.HW12;

import java.util.*;

class Solution {
    private int[] parents;

    private int find(int x) {
        if (x != parents[x]) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }

    private boolean union(int x, int y) {
        int r1 = find(x);
        int r2 = find(y);

        if (r1 != r2) {
            parents[r2] = r1;
            return true;
        }
        return false;
    }

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        parents = new int[n + 1];
        for (int i = 0; i < parents.length; i++) { 
            parents[i] = i;
        }

        List<int[]> edges = new ArrayList<>();

        for (int[] pipe : pipes) {
            edges.add(new int[]{pipe[2], pipe[0] - 1, pipe[1] - 1});
        }

        // build dummy edges from each house to the dummy node n
        for (int i = 0; i < wells.length; i++) {
            edges.add(new int[]{wells[i], i, n});
        }

        edges.sort(Comparator.comparingInt(a -> a[0]));
        int ans = 0;

        for (int[] edge : edges) {
            int c = edge[0], u = edge[1], v = edge[2];
            if (union(u, v)) {
                ans += c;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] wells = {1, 1};
        int[][] pipes = {{1, 2, 1}, {1, 2, 2}};

        Solution solution = new Solution();
        int test = solution.minCostToSupplyWater(n, wells, pipes);

        System.out.println(test);
    }
}
