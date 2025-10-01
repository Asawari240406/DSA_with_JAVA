// find common elements in all rows of a given row-wise sorted matrix.
import java.util.HashMap;
public class array2d_5 {
    public static void main(String args[])
    {
        int[][] matrix = {{ 1, 2, 3, 4, 5 },
        { 2, 4, 5, 8, 10 },
        { 3, 5, 7, 9, 11 },
        { 1, 3, 5, 7, 9 }};

        int row = matrix.length;
        int col = matrix[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j=0; j<col; j++)
        {
            map.put(matrix[0][j], 1);
        }

        for(int i=1; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(map.containsKey(matrix[i][j]) && map.get(matrix[i][j]) == i)
                {
                    map.put(matrix[i][j], map.get(matrix[i][j]) + 1);
                }

                if(i == row-1 && map.containsKey(map.get(matrix[i][j])) && map.get(matrix[i][j]) == row)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
