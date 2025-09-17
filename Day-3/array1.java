// trapped water problem in an array.
public class array1 {
    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        int n = height.length;

        //left boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++)
        {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // right boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i= n-2; i>=0;i--)
        {
            rightmax[i] = Math.max(height[i], leftmax[i+1]);
        }

        //calculating the water level 
        int tw =0 ;
        for(int i=0;i<n;i++)
        {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            tw += waterlevel - height[i];
        }

        System.out.println("Total water trapped is "+tw);
    }
}
