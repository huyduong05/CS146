package HW.HW7;

import java.util.Arrays;

public class hw7 {
    public int minMeetingRooms(int[][] intervals) {  

        int count = 0; 
        int max = 0; 
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) { 
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int l = 0;
        int r = 0; 

        while (l < intervals.length) { 
            if (start[l] < end[r]) { 
                count++; 
                l++;
            } else { 
                r++;
                count--;
            }
            max = (max > count) ? max : count;
        }
        
        return max;
     }

     public static void main(String[] args) {
        int[][] test1 = { {0,30},{5,10},{15,20} };
        int[][] test2 = { {0, 1}, {1, 2}, {2, 3}};
        int[][] test3 = { {7, 10}, {2, 4} };

        hw7 x = new hw7();

        System.out.println("Test 1: " + x.minMeetingRooms(test1));
        System.out.println("Test 2: " + x.minMeetingRooms(test2));
        System.out.println("Test 3: " + x.minMeetingRooms(test3));

     }

}
