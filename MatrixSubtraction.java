import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Subtract matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        // Display result
        System.out.println("Resultant matrix after subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
