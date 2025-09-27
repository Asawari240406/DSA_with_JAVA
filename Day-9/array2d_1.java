// the diagonal traversal of a 2D array.
public class array2d_1 {
    public static void main(String args[])
    {
        int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int row = 0;
        int col = 0;
 
        int n= arr.length; //length od row
        int m = arr[0].length; // length of column 

        int ans[] = new int[n*m];
        int idx = 0;

        boolean up = true;

        while(row < n && col < m)
        {
            if(up == true)
            {
                while(row > 0 && col < m-1)
                {
                    ans[idx++] = arr[row][col];
                    row--;
                    col++;
                }
                ans[idx++] = arr[row][col];
                if(col == m-1)
                {
                    row++;
                }
                else
                {
                    col++;
                }
            }
            else
            {
                while(row < n-1 && col > 0)
                {
                    ans[idx++] = arr[row][col];
                    row++;
                    col--;
                }
                ans[idx++] = arr[row][col];
                if(row == n-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }
            }
            up = !up;
        }
        System.out.println("The diagonal traversal is : ");
        for(int i=0 ; i<ans.length; i++)
        {
            System.out.print(" "+ans[i]);
        }
    }    
}
