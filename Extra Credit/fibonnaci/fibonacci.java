package fibonnaci;
public class fibonacci { 
    public static int fibonacciNumber(int n) { 
        if (n <= 0) { 
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[] past = {0, 1};
        int temp = 0;
        for (int i = 1; i < n; i++) { 
            temp = past[0] + past[1];    
            past[0] = past[1];
            past[1] = temp;
        }

        return temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) { 
            System.out.print(fibonacciNumber(i) + " ");
        }
    }
    
}