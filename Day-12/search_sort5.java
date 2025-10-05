// Find duplicates in O(n) time and O(n) extra space
import java.util.ArrayList;

public class search_sort5 {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 6, 3, 6, 1};
        int n = arr.length;
        ArrayList <Integer> ans = new ArrayList<>(); 

        for(int i=0; i<n; i++)
        {
            if(arr[Math.abs(arr[i])] >= 0)
            {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else
            {
                ans.add(Math.abs(arr[i]));
            }
        }
        System.out.print("duplicate elements are : "+ans);
    }
}
