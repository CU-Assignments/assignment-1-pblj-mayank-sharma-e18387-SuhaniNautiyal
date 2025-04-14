// src/MatrixOperations.java
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows and columns of matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] m1 = new int[rows][cols];
        int[][] m2 = new int[rows][cols];

        System.out.println("Enter Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m1[i][j] = sc.nextInt();

        System.out.println("Enter Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m2[i][j] = sc.nextInt();

        System.out.println("Addition:");
        printMatrix(addMatrices(m1, m2));

        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(m1, m2));

        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(m1, m2));
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
