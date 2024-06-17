package lab6;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			
			if (isEven(number)) {
			    System.out.println(number + " is even.");
			} else {
			    System.out.println(number + " is odd.");
			}
		}
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
