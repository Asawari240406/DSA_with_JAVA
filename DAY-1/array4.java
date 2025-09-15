// find the duplicate element in an array using HashMap in java 
import java.util.HashMap;

public class array4 {
    public static void main(String args[])
    {
        int arr[] = {1,4,7,3,9,4};
        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i]) > 1)
            {
                System.out.println("Duplicate element is :"+arr[i]);
                break;
            }
        }
    }
}
