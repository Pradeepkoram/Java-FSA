package lab6;

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter three numbers separated by spaces: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			
			int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
			
			System.out.println("The largest number is: " + largest);
		}
    }
}
