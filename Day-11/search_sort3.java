// Common elements in three sorted arrays.
import java.util.ArrayList;
import java.util.Arrays;

public class search_sort3 {
    public static void main(String args[])
    {   
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 5, 10, 20, 40, 80));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 7, 20, 80, 100));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120));

        ArrayList<Integer> result = new ArrayList<>();

        int n1 = arr1.size();
        int n2 = arr2.size();
        int n3 = arr3.size();
        int i=0, j=0, k=0;

        while(i<n1 && j<n2 && k<n3)
        {
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);

            if(a==b && b==c)
            {
                if(result.isEmpty() || result.get(result.size()-1) != a)
                {
                    result.add(a);
                }
                i++;
                j++;
                k++;
            }

            else if(a<b)
            {
                i++;
            }
            else if(b<c)
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        System.out.println("Common elements are:" + result);
    }
}
