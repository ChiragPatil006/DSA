// Write a program to calculate power using recursion
import java.util.Scanner;

public class Power {
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * calPower(x, n - 1);
    }

    public static int optimizedCalPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedCalPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Power using O(n): " + calPower(x, n));
        System.out.println("Power using O(log n): " + optimizedCalPower(x, n));
        sc.close();
    }
}

// more optimized version remaining
