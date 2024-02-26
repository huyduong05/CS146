package HW.HW8;

import java.util.HashSet;

public class hw8 {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i);
            if (set.contains(c)) { 
                count += 2;
                set.remove(c);
            } else { 
                set.add(c);
            }
        }

        if (set.size() > 0) { 
            count++; 
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        hw8 x = new hw8();
        System.out.println("Input: " + s + "  Output: " + x.longestPalindrome(s));
        s = "speediskey";
        System.out.println("Input: " + s + "  Output: " + x.longestPalindrome(s));
    }
}
