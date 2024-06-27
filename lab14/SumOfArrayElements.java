package lab14;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate sum of array elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // Print sum
        System.out.println("Sum of array elements: " + sum);
        
        scanner.close();
    }
}
