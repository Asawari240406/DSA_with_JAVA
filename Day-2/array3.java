// find duplicate and missing number in an array
import java.util.HashSet;

public class array3 {
    public static void main(String args[])
    {
        int grid[][] = {{1,3},{2,2}};
        HashSet<Integer> set = new HashSet<>();
        int curSum = 0;
        int n = grid.length;
        int sq = n*n;
        int ans[] = new int[2];

        //finding the duplicate and sum of unique elements
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(set.contains(grid[i][j]))
                {
                    ans[0] = grid[i][j];
                }
                else
                {
                    set.add(grid[i][j]);
                    curSum += grid[i][j];
                }
            }
        }

        //finding the missing number 
        int totalSum = sq * (sq + 1)/2;
        ans[1] = totalSum - curSum;

        System.out.println("duplicate ="+ ans[0]);
        System.out.println("missing ="+ ans[1]);
    }
}
