// chocolate distribution problem.
import java.util.Arrays;
public class array5 {
    public static void main(String args[])
    {
        int arr[] = {1,8,15,19,5,10,17,20};
        int m = 5;

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;

        // Special case

        if(m > n)
        {
            System.out.println("-1");
            return;
        }

        if( m == 0 || n == 0)
        {
            System.out.println("0");
            return;
        }

        // main case 
        for(int i=0; i <= (n-m) ; i++)
        {
            minDiff = Math.min(minDiff, arr[i+m-1] - arr[i]);
        }
        System.out.println("Minimum difference is :"+minDiff);
    }
}
