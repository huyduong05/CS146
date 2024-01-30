 import java.util.Arrays;
import java.util.HashMap;

public class Lab1 { 
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < nums.length; i++) { 
            int difference = target - nums[i];
            if (map.containsKey(difference)) { 
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        } 
        return new int[]{};
    }

    
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        System.out.println("Test 1: " + Arrays.toString(twoSum(arr1, 9)));

        int[] arr2 = {3, 2, 4};
        System.out.println("Test 2: " + Arrays.toString(twoSum(arr2, 6)));

        int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Test 3: " + Arrays.toString(twoSum(arr3, 17)));
    }
}