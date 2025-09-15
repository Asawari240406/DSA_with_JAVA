// Maximum subarray sum using kadane's algorithm
public class array3 {
    public static void main(String args[])
    {
        int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
        if(arr.length ==1 && arr[0] == -1)
        {
            System.out.println("maximum subarray sum is : -1");
        }

        int cs = arr[0];
        int ms = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs, ms);
        }

        System.out.println("maximum subarray sum is : "+ms);
    }
}
