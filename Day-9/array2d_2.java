public class array2d_2 {
    public static void main(String args[])
    {
        int matrix[][] = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        boolean firstRow = false;
        boolean firstCol = false;

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] ==0)
                {
                    if(i == 0) 
                    {
                        firstRow = true;
                    }
                    if(j == 0)
                    {
                        firstCol = true;
                    }
                }
            }
        }

        for( int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                matrix[0][j] = 0;
            }
        }

        if(firstCol)
        {
            for(int i=0; i<matrix.length; i++)
            {
                matrix[i][0] = 0;
            }
        }

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
