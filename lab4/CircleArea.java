package lab4;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + area);
            System.out.print("Do you want to find the area of another circle? (YES/NO): ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("YES"));
        
        scanner.close();
    }
}