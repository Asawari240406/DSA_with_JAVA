// find the minimum element in a sorted and rotated array.
public class array4 {
    public static void main(String args[])
    {
        int arr[] = {3,4,5,1,2};
        int n= arr.length;
        int start = 0;
        int end = n-1;
       
        while(start < end)
        {
            int mid = start +(end - start) /2;
            if(arr[mid] > arr[end])
            {
                start = mid +1;
            }
            else
            {
                end = mid;
            }
        }
        System.out.println("Minimum element in an array is "+arr[start]);
    }
    
}
