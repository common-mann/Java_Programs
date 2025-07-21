/*

0 1 0 1 
1 0 1 0 
0 1 0 1 
1 0 1 0 

*/

import java.util.Scanner;

public class CheckBoard {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
}
