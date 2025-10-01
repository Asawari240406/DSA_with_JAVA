//largest rectangle in histogram 

import java.util.Stack;

public class array2d_3
{
    public static void main(String args[])
    {
        int[] heights = {2,1,5,6,2,3};
        int n = heights.length;

        Stack<Integer> s = new Stack<>();
        int[] right = new int[n];
        int[] left = new int[n];
        
        for(int i=n-1; i>=0; i--)
        {
            while(!s.empty() && heights[s.peek()]>heights[i])
            {
                s.pop();
            }
            right[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        s.clear();

         for(int i=0; i<n; i++)
        {
            while(!s.empty() && heights[s.peek()]>heights[i])
            {
                s.pop();
            }
            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }


        int ans =0;
        for(int i=0; i<n; i++)
        {
            int width = right[i] - left[i] - 1;
            ans = Math.max(ans, heights[i] * width);
        }
        System.out.println("large rectangle in histogram "+ans);
    }
}
