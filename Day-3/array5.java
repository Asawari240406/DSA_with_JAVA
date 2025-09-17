// find the sum of two elements in a sorted and rotated array.
public class array5 {
    public static void main(String args[])
    {
        int arr[] = {1,2,5,4,3};
        int target = 6;
        int n = arr.length;
        int pivote = -1;

        for(int i=0;i <n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                pivote= i;
                break;
            }
        }

        if(pivote == -1)
        {
            pivote = n-1;
        }

        int start = (pivote + 1) % n ;
        int end = pivote;
        Boolean found = false;
       
        while(start != end)
        {
            int sum = arr[start] + arr[end];
            if(sum == target)
            {
                System.out.println("the numbers having the sum is equal to target is "+arr[start]+ " "+arr[end]);
                found = true;
                break;
            }
            else if (sum < target)
            {
                start = ( start +1) % n;
            }
            else
            {
                end = (n + end -1) % n;
            }
        }
        if(!found)
        {
         System.out.println("the numbers having the sum is equal to target is not found");
        }
    }
}
