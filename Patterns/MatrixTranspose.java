import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter a number of columns : ");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter the array elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        transpose(matrix,rows,cols);
    }
    static void transpose(int[][] matrix,int rows,int cols)
    {
        int[][]Transpose=new int[rows][cols];
         for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                Transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix is:");
         for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
