import java.util.Scanner;

public class ConcentricSquareNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int size=2*n-1;
        
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                int min = Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                // Math.min(i, j)                           -->gives minimum for the top left square    eg:i=0,j=0,i=1
                // Math.min(size - i - 1, size - j - 1)     -->gives minimum for bottom right square
                //System.out.print((n - min) + "  ");       //--> Expand numbers
                System.out.print((min+1) + "  ");          //--> Shrink numbers
            }
            System.out.println();
        }
    }
}

/*
    1  1  1  1  1  1  1  1  1  
    1  2  2  2  2  2  2  2  1
    1  2  3  3  3  3  3  2  1
    1  2  3  4  4  4  3  2  1
    1  2  3  4  5  4  3  2  1
    1  2  3  4  4  4  3  2  1
    1  2  3  3  3  3  3  2  1
    1  2  2  2  2  2  2  2  1
    1  1  1  1  1  1  1  1  1
*/