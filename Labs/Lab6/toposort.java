package Labs.Lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class toposort {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adjList = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        for (int[] pre: prerequisites) { 
            if (adjList[pre[1]] == null) { 
                adjList[pre[1]] = new ArrayList<Integer>();
            }
            adjList[pre[1]].add(pre[0]);
            indegree[pre[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) { 
            if (indegree[i] == 0) { 
                q.add(i);
            }
        }
        int[] result = new int[numCourses];
        int count = 0;

        while (!q.isEmpty()) { 
            int pop = q.remove();
            result[count] = pop;
            count++;
            
            if (adjList[pop] != null) { 
                for (var x: adjList[pop]) { 
                    indegree[(Integer)x]--;

                    if (indegree[(Integer)x] == 0) { 
                        q.add((Integer)x);
                    }
                }
            }
        }

        if (numCourses == count) { 
            return true;
        } else { 
            return false;
        }
    }

    public static void main(String[] args) {
        int numC = 2;
        int[][] pre = {{1, 0}};
        toposort x = new toposort();
        System.out.println("DAG: " + x.canFinish(numC, pre));

        int[][] pre2 = {{1, 0}, {0, 1}};
        System.out.println("Cyclic: " + x.canFinish(numC, pre2));
    }
}
