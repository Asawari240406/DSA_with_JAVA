

public class search_sort5 {
   public static void main(String args[])
   {
     int arr[] = {1, 2, 8, 10, 11, 12, 19};
    int ans =-1;

    int start = 0;
    int end = arr.length-1;
    int x = 5;

    while(start <= end)
    {
        int mid = start + (end-start)/2;
        if(arr[mid] >= x)
        {
            ans = mid;
            end = mid-1;
        }
        else
        {
            start = mid+1;
        }
    }
    System.out.println("ceil of x is: " +ans);
   }
}
