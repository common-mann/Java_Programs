import java.util.Scanner;

public class PascalsTriangle 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            // Padding for triangle shape
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);  // LOGIC FOR PASCAL'S TRIANGLE
            }
            System.out.println();
        }

    }
}

/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 

 */

