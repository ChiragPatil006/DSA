// Write a Java program using recursion to print all numbers from 1 to n in increasing order.

import java.util.Scanner;

public class PrintIncreasing {
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " "); // base case
            return;
        }
        printIncreasing(n - 1); // recursive call
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input an integer: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
                return;
            }
            System.out.print("Output: ");
            printIncreasing(n);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}

