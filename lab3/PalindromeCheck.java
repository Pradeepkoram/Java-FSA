package lab3;

import java.util.Scanner;
public class PalindromeCheck {

    // Function to check if a number is palindrome
    static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;
        
        while(num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if(isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
