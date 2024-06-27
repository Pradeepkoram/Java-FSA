package lab13;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        try (Scanner scanner = new Scanner(System.in)) {
			// Get matrix data from user
			System.out.println("Enter matrix data (" + rows + "x" + cols + " elements):");
			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < cols; j++) {
			        System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
			        matrix[i][j] = scanner.nextInt();
			    }
			}
		}

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix, rows, cols);

        // Calculate transpose of the matrix
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // Print transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose, cols, rows);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
