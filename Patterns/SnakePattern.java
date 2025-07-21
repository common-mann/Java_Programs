import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter no. of cols : ");
        int cols=sc.nextInt();
        int value=1;

        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            if(i%2==0)//left to right
            {
                for(int j=0;j<cols;j++)
                {
                    arr[i][j]=value++;
                }
            }
            else
            {
                for(int j=cols-i;j>=0;j--)
                {
                    arr[i][j]=value++;
                }
            }
        }
        for(int a=0;a<rows;a++)
        {
            for(int b=0;b<cols;b++)
            {
                System.out.print(arr[a][b]+ " ");
            }
            System.out.println();
        }
    }
}
