// most water that can be contained within the container formed by the lines.
public class array2 {
    public static void main(String arge[])
    {
        int arr[] ={1,8,6,2,5,4,8,3,7};
        int n= arr.length;
        int maxWater = 0;
        
        int start = 0;
        int end = n-1;

        //special case 
        if(arr == null || n < 0)
        {
            System.out.println("0");
            return;
        }

        while(start < end)
        {
            int height = Math.min(arr[start], arr[end]);
            int width = end - start;

            int curWater = height * width;
            maxWater = Math.max(curWater, maxWater);

            if(arr[start] < arr[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        System.out.println("maximium water:"+ maxWater);
    }
}
