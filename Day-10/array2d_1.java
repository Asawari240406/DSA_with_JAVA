// total number of islands in a 2D array
public class array2d_1
{
    public static void main(String args[])
    {
        char arr[][] = {{'1','1','1','1','0'},
  {'1','1','0','1','0'},
  {'1','1','0','0','0'},
  {'0','0','0','0','0'}};


        if(arr == null || arr.length == 0 || arr[0].length == 0)
        {
            System.out.println("0");
            return;
        }

        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j] == '1')
                {
                    dfs(arr, i, j);
                    count++;
                }
            }
        }
        System.out.println("total number of island is "+count);
    }
     public static void dfs(char arr[][], int i, int j)
        {
            if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j] == '0')
            {
                return;
            }

            arr[i][j] = '0';

            dfs(arr, i+1, j);
            dfs(arr, i-1, j);
            dfs(arr, i, j+1);
            dfs(arr, i, j-1);
        }
}
