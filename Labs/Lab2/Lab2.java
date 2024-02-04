package Labs.Lab2;

import java.util.HashMap;

public class Lab2 {
    public static boolean isAnagram(String s, String t) { 
        if (s.length() != t.length()) { 
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) { 
            if (!map1.containsKey(s.charAt(i))) { 
                map1.put(s.charAt(i), 0);
            } else { 
                map1.replace(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }

            if (!map2.containsKey(t.charAt(i))) { 
                map2.put(t.charAt(i), 0);
            } else { 
                map2.replace(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }
        }

        return map1.equals(map2);
    }
    
    
    public static void main(String[] args) {
        String s = "tea";
        String t = "eat";
        System.out.println(isAnagram(s, t));

        s = "fried";
        t = "fried";
        System.out.println(isAnagram(s, t));

        s = "latte";
        s = "late";
        System.out.println(isAnagram(s, t));

        s = "abcdef";
        t = "bedcfa";
        System.out.println(isAnagram(s, t));

    }
}
