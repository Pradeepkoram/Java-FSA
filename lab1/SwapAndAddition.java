package lab1;

import java.util.Scanner;

public class SwapAndAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Swap the values of num1 and num2
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        
        int sum = num1 + num2;
        
        System.out.println("The addition of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}