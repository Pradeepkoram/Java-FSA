package lab7;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("------------------");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    System.exit(0);
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error! Invalid operation.");
                System.exit(0);
        }
        
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        
        scanner.close();
    }
}
