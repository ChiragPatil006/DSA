// Write a recursive program in Java to print numbers in decreasing order from n down to 1.

import java.util.Scanner;
public class PrintDecreasing {
    public static void printDecreasing(int n) {
        if (n == 1) {  // base case
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);  // recursively calling the function by breaking it into small instances 
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Input an integer: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
                return;
            }
            System.out.print("Output: ");
            printDecreasing(n);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}






