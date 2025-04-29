import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = s.nextInt();

        if (rows != cols) {
            System.out.println("Matrix is not symmetric. (A matrix must be square to be symmetric.)");
            s.close();
            return;
        }

        int[][] matrix = new int[rows][cols];
        
        // Accepting matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        
        // Print the matrix
        System.out.println("Entered Matrix:");
        printMatrix(matrix, rows, cols);
        
        // Check if the matrix is symmetric
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("Matrix is not symmetric.");
                    s.close();
                    return;
                }
            }
        }
        System.out.println("Matrix is Symmetric.");
        s.close();
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
