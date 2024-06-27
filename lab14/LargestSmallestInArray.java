package lab14;

import java.util.Scanner;

public class LargestSmallestInArray {
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
        
        // Initialize variables to store largest and smallest elements
        int largest = arr[0];
        int smallest = arr[0];
        
        // Find largest and smallest elements in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        // Print results
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Smallest element in the array: " + smallest);
        
        scanner.close();
    }
}
