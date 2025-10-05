public class search_sort2 {
    public static void main(String args[])
    {
        int arr[] = {5, 1, 3, 4, 7};
        int n = 5;
        int sum = 12;
        int ans =0;

        for(int i=0; i<n-2; i++)
        {
            int j= i+1;
            int k = n-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k] >= sum)
                {
                    k--;
                }
                else
                {
                    ans += (k-j);
                    j++;
                }
            }
        }
        System.out.println("Count of triplets is: "+ans);
        
    }
}
