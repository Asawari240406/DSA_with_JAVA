// merge two sorted arrays without extra space and sort them 
import java.util.Arrays;

public class search_sort3 
{
    public static void main(String args[]) 
    {
        int a[] = {2, 4, 7, 10};
        int b[] = {2, 2, 3, 4};

        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;
        int k = n-1;
        
        while(i<=k && j<m)
        {
            if(a[i] > b[j])
            {
                int temp = b[j];
                b[j] = a[k];
                a[k] = temp;
                    
                j++;
                k--;
            }
            else
             {
                i++;
                continue;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
    }
}
