//  @GPT 

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nRotated 90 Degrees:");
        rotate90(matrix);

        System.out.println("\nRotated 180 Degrees:");
        rotate180(matrix);
    }

    static void rotate90(int[][] matrix) // for (90)--> 2 steps: Transpose && Reverse each Row
    {
        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        printMatrix(matrix);
    }

    static void rotate180(int[][] matrix) // for(180)--> 2 steps : Reverse rows && Reverse columns
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Reverse rows
        for (int i = 0; i < rows / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[rows - 1 - i];
            matrix[rows - 1 - i] = temp;
        }

        // Reverse columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0, k = cols - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}