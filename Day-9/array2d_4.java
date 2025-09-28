// rotate a 2D array by 90 degree clockwise in place 

public class array2d_4 
{
    static public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) 
        {
            for (int j = 0; j < n / 2; j++) 
            {
                int temp = matrix[i][j];  
                matrix[i][j] = matrix[n - 1 - j][i];  
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j]; 
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i]; 
                matrix[j][n - 1 - i] = temp; 
            }
        }
    }
    public static void main(String[] args) 
    {
        // Test case 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original 3x3 matrix:");
         for (int i = 0; i < matrix1.length; i++) 
         {
            for (int j = 0; j < matrix1[i].length; j++) 
            {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        rotate(matrix1);
        System.out.println("After rotation:");
         for (int i = 0; i < matrix1.length; i++) 
         {
            for (int j = 0; j < matrix1[i].length; j++) 
            {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
           
         }
    }  
}