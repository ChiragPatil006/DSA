// Find the factorial of a number
public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]) {
        int n = 5;
        int fac = fact(n);
        System.out.print(fac);
    }
}

// more improvisement pending
