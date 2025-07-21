public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        sumOfDiagonals(matrix,matrix.length,matrix[0].length);
    }
    static void sumOfDiagonals(int[][] matrix,int row,int col)
    {
        int minor=0, major=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    major+=matrix[i][j];
                }
                if(i+j==row-1)
                {
                    minor+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Major Diagonal is : "+major);
        System.out.println("Sum of Minor Diagonal is : "+minor);
    }
}

