// maximum reactangle in a 2D binary matrix filled with 0's and 1's.
import java.util.*;

public class array2d_4 
{
    static public int maximalRectangle(char[][] matrix) 
    {
        if (matrix.length == 0) 
        {
            return 0;
        }

        int height[] = new int[matrix[0].length];
        int largest = 0;

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                int val = matrix[i][j] - '0';
                if (val == 0) 
                {
                    height[j] = 0;
                } 
                else 
                {
                    height[j] += val;
                }
            }

            int maxRect = largestRectangleArea(height);
            if (largest < maxRect) 
            {
                largest = maxRect;
            }
        }
        return largest;
    }

    static public int largestRectangleArea(int[] heights) 
    {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) 
        {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) 
            {
                s.pop();
            }
            right[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        s.clear();

        for (int i = 0; i < n; i++) 
        {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) 
            {
                s.pop();
            }
            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) 
        {
            int width = right[i] - left[i] - 1;
            ans = Math.max(ans, heights[i] * width);
        }
        return ans;
    }
    public static void main(String args[])
    {
          char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        int result = maximalRectangle(matrix);
        System.out.println("Maximum rectangle area: " + result);
    }
}
