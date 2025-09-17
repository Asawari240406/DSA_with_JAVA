// Maximum product subarray
public class array3 {
    public static void main(String args[])
    {
        int arr[] = {2,3,-2,4};
        int n= arr.length;
        int mini = arr[0];
        int maxi = arr[0];
        int ans = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i] < 0)
            {
                int temp = mini;
                mini = maxi; 
                maxi = temp;
            }

            maxi = Math.max(maxi * arr[i], arr[i]);
            mini = Math.min(mini * arr[i], arr[i]);
            ans = Math.max(ans, maxi);
        }
        System.out.println("Maximum product subarray is "+ans);
        }
    }

