import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort { 

    public static int[] kahnAlgorithm(int numV, int[][] list) { 
    
        //create indegree list
        int[] indegree = new int[numV];
        for (int[] n : list) { 
            for (int v : n) { 
                indegree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        //add all vertices with a indegree of 0
        for (int i = 0; i < numV; i++) { 
            if (indegree[i] == 0) { 
                q.add(i);
            }
        }

        int[] result = new int[numV];
        int count = 0;

        while (!q.isEmpty()) { 
            int pop = q.remove();
            result[count] = pop;
            count++;
            
            if (list[pop].length > 0) { 
                for (int x: list[pop]) { 
                    indegree[x]--;

                    if (indegree[x] == 0) { 
                        q.add(x);
                    }
                }
            }
        }

        if (numV == count) { 
            return result;
        } else { 
            return new int[]{};
        }
    }

    public static int[] BFS(int numV, int[][]list) {
        return kahnAlgorithm(numV, list);
    }


    public static int[] DFS(int numV, int[][]list) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[numV];
        int[] result = new int[numV];
        int count = 0; 

        for (int i = 0; i < numV; i++) { 
            if (!visited[i]) { 
                DFSHelper(i, list, visited, stack);
            }
        }

        while (!stack.empty()) { 
            result[count++] = stack.pop();
        }
        return result;

    }

    public static void DFSHelper(int v, int[][] list, boolean[] visited, Stack<Integer> stack) { 
        visited[v] = true;

        for (int i : list[v]) { 
            if (!visited[i]) { 
                DFSHelper(i, list, visited, stack);
            }
        }

        stack.push(v);
    }

    public static void printArray(int[] array) { 
        for (int x : array) { 
            System.out.print(x + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int numVertices = 5;
        int[][] adjList = { {1}, {2, 4}, {}, {4}, {} };
        /*
        * 0 -> 1
        * 1 -> 2, 4
        * 2 -> 
        * 3 -> 4
        * 4 -> 
        * Kahn's: 0 3 1 2 4
        * DFS: 3 0 1 4 2 
        */
        System.out.println("Kahn's Algorithm: ");
        printArray(kahnAlgorithm(numVertices, adjList));
        System.out.println();

        System.out.println("BFS: ");
        printArray(BFS(numVertices, adjList));
        System.out.println();

        System.out.println("DFS: ");
        printArray(DFS(numVertices, adjList));
    }





}