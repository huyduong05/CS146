package HW.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HW6 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        
        //no possible triplets
        if (nums[0] > 0) { 
            return result;
        }

        for (int i = 0; i < nums.length; i++) { 
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) { 
            
            //no more possible triplets
            if (nums[0] > 0) { 
                return result;
            }

            for (int j = i + 1; j < nums.length - 1; j++) {
                int needed = -1 * (nums[i] + nums[j]);
                if (map.containsKey(needed) && (map.get(needed) > j)) { 
                    result.add(Arrays.asList(nums[i], nums[j], needed));
                }
                j = map.get(nums[j]); //updates j to last occurence of nums[j] (avoids duplicates)
            }
            i = map.get(nums[i]); //updates i to last occurence of nums[i] (avoids duplicates)
        }

        return result;
    }

    public static void main(String[] args) {
        HW6 x = new HW6();
        
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = x.threeSum(nums);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + result);
        System.out.println();

        int[] nums2 = {-5, 0, 5,10, -10, 0};
        result = x.threeSum(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + result);
    }
}
