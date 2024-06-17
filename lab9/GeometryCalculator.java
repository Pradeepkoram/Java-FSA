package lab9;

import java.util.Scanner;
//Geometry class with overloaded methods
class Geometry {
 
 public double calculateArea(double length, double width) {
     return length * width;
 }

 public double calculateArea(double radius) {
     return Math.PI * radius * radius;
 }

 public double calculateVolume(double length, double width, double height) {
     return length * width * height;
 }
}

public class GeometryCalculator {
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
		Geometry geometry = new Geometry();

		 System.out.println("Geometry Calculator");
		 System.out.println("1. Calculate area of a rectangle");
		 System.out.println("2. Calculate area of a circle");
		 System.out.println("3. Calculate volume of a box");
		 System.out.println("4. Exit");

		 while (true) {
		     System.out.print("\nEnter your choice (1-4): ");
		     int choice = scanner.nextInt();

		     switch (choice) {
		         case 1:
		             System.out.print("Enter length of rectangle: ");
		             double length = scanner.nextDouble();
		             System.out.print("Enter width of rectangle: ");
		             double width = scanner.nextDouble();
		             double areaRectangle = geometry.calculateArea(length, width);
		             System.out.println("Area of rectangle: " + areaRectangle);
		             break;
		         case 2:
		             System.out.print("Enter radius of circle: ");
		             double radius = scanner.nextDouble();
		             double areaCircle = geometry.calculateArea(radius);
		             System.out.println("Area of circle: " + areaCircle);
		             break;
		         case 3:
		             System.out.print("Enter length of box: ");
		             double boxLength = scanner.nextDouble();
		             System.out.print("Enter width of box: ");
		             double boxWidth = scanner.nextDouble();
		             System.out.print("Enter height of box: ");
		             double boxHeight = scanner.nextDouble();
		             double volumeBox = geometry.calculateVolume(boxLength, boxWidth, boxHeight);
		             System.out.println("Volume of box: " + volumeBox);
		             break;
		         case 4:
		             System.out.println("Exiting Geometry Calculator. Goodbye!");
		             System.exit(0);
		         default:
		             System.out.println("Invalid choice. Please enter a number between 1 and 4.");
		     }
		 }
	}
 }
}

