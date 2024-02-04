package HW.HW1;

public class HW1 {
    //brute force (two for loops)
    public boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        String edited = ""; 
        for (int i = 0; i < s.length(); i++) { 
            if (Character.isLetterOrDigit(s.charAt(i))) { 
                edited += s.charAt(i);
            }
        }
        if (edited.length() <= 1) { 
            return true;
        }
        

        for (int i = 0; i < edited.length() / 2; i++) { 
            if (edited.charAt(i) != edited.charAt(edited.length() - i - 1)) { 
                return false;
            }
        }
        return true;
    }

    //two pointer
    public boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        int p1 = 0; 
        int p2 = s.length() - 1;

        while (p1 <= p2) { 
            char c1 = s.charAt(p1);
            char c2 = s.charAt(p2);

            if (!Character.isLetterOrDigit(c1)) { 
                p1++;
            } else if (!Character.isLetterOrDigit(c2)) { 
                p2--;
            } else { 
                if (c1 != c2) { 
                    return false; 
                }
                p1++;
                p2--;
            }
        }
        return true;
    }
}    

