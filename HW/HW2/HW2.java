package HW.HW2;

public class HW2 {
    //only works if there is a bad version
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {  
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) { 
                high = mid;
            } else { 
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isBadVersion(int n) { 
        switch (n) {
            case 1 :
                return false;
            case 2 : 
                return false;
            case 3 : 
                return false;
            case 4 :
                return true;
            case 5 : 
                return true;
            case 6 : 
                return true;
            case 7: 
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // firstBadVersion should be 4
        System.out.println(firstBadVersion(7));
        System.out.println(firstBadVersion(4));
        System.out.println(firstBadVersion(6));
        System.out.println(firstBadVersion(5));

    }
}
