package lab13;

import java.util.Random;

public class SumPositiveOddNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of elements in the array
        int[] arr = new int[n];
        Random random = new Random();

        // Generate array of n elements
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(201) - 100; // Random integers between -100 and 100
        }

        // Sum positive odd numbers
        int sum = 0;
        for (int num : arr) {
            if (num > 0 && num % 2 != 0) {
                sum += num;
            }
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of positive odd numbers: " + sum);
    }
}
