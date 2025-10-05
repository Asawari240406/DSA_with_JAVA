// Permute two arrays such that sum of every pair is greater or equal to K.
import java.util.Arrays;

public class search_sort1 {
    public static void main(String args[])
    {
        int arr1[] = {2, 1, 3};
        int arr2[] = {7, 8, 9 };
        int k =10;

        int n = arr1.length;
        
         Arrays.sort(arr1);
         Arrays.sort(arr2);

        for(int i=0; i<n; i++)
        {
            if(arr1[i] + arr2[n-1-i] < k)
            {
                System.out.println("Not Possible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
