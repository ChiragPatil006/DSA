/*Write a Java program to calculate the sum of the first n natural numbers using recursion. 
The program should take an integer n as input and output the sum. 
If the input is not a positive integer, display an appropriate error message. */

import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    // Recursive function to calculate sum
    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input an integer: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
                return;
            }

            int sum = printSum(n);  // call recursive method
            System.out.println("Output: " + sum);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
