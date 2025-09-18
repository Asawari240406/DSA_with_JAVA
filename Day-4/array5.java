// minimum operations to make an array palindrome 
public class array5 {
    public static void main(String args[])
    {
        int arr[] ={1,4,5,9,1};
        int n= arr.length;

        int count = 0;

        int i = 0;
        int j = n-1;

        while(i <= j)
        {
            if(arr[i] == arr[j])
            {
                i++;
                j--;
            }
            else if (arr[i] < arr[j])
            {
                i++;
                arr[i] += arr[i-1];
                count++;
            }
            else
            {
                j--;
                arr[j] += arr[j+1];
                count++;
            }
        }
        System.out.println("minimum operations to make array palindrome is : "+ count);
    }
}
