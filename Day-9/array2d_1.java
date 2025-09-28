// zigzag Traversal of a matrix 
public class array2d_1 {
    static public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int ans[] = new int[n * m];
        int idx = 0;
        int row = 0;
        int col = 0;
        boolean up = true;

        while (row < n && col < m) 
        {
            if (up == true) 
            {
                while (row > 0 && col < m - 1) 
                {
                    ans[idx++] = mat[row][col];
                    row--;
                    col++;
                }
                ans[idx++] = mat[row][col];
                if (col == m - 1) 
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
                while (row < n - 1 && col > 0) 
                {
                    ans[idx++] = mat[row][col];
                    row++;
                    col--;
                }
                ans[idx++] = mat[row][col];
                if (row == n - 1) 
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
        return ans;
    }
    public static void main(String[] args) {

        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] result1 = findDiagonalOrder(mat1);
        for (int num : result1) 
        {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}