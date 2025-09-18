// sum of three elements in an array such that the sum is zero. 
import java.util.*;
public class array1
{
    public static void main(String args[])
    {
        int arr[] = {-1,0,1,2,-1,-4};
        int n= arr.length;
        Set <List<Integer>> result = new HashSet<>();

        Arrays.sort(arr);

        for(int i=0; i< n-2; i++)
        {
            int start = i+1;
            int end = n-1;
            while(start < end) 
            {
                int sum = arr[i] + arr[start] + arr[end];
                if(sum == 0)
                {
                    result.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;
                }
                else if(sum < 0)
                {
                    start++;         
                 }
                 else{
                    end --;
                 }
            }
        }
        System.out.println(result);
    }
}