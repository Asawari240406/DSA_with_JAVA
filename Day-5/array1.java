// find the largest number from the given array and return it as string. 
import java.util.*;
public class array1 {
    public static void main(String args[])
    {
        int arr[] = {3,30,34,5,9};
        int n = arr.length;
        String s[] = new String[n];

        for(int i=0; i<n; i++)
        {
            s[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String str: s)
        {
            sb.append(str);
        }

        String result = sb.toString();
        if(result.startsWith("0"))
        {
            System.out.println("largest number is 0");
        }
        else
        {
            System.out.println("largest number is "+ result);
        }

    }    
}
