/*
This program rotates a square matrix 90 degrees in the clockwise direction.
*/
public class array2d_3 {
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3},{5,6,7},{9,10,11}};
        int n= arr.length;

        for(int i=0; i< n / 2; i++)
        {
            for(int j=0; j < n/2; j++)
            {
                int temp = arr[i][j];  
                arr[i][j] = arr[n - 1 - j][i];  
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j]; 
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i]; 
                arr[j][n - 1 - i] = temp;    
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(" "+arr[i][j]); 
            }
        }
    }
}

// for 90 degree rotation of matrix in anticlickwise direction 
// int temp = mat[i][j];
//                 mat[i][j] = mat[j][n - 1 - i];
//                 mat[j][n - 1 - i] = mat[n - 1 - i][n - 1 - j];
//                 mat[n - 1 - i][n - 1 - j] = mat[n - 1 - j][i];
//                 mat[n - 1 - j][i] = temp;