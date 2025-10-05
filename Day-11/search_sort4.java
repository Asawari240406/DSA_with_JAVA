// K-diff pairs in an array.
import java.util.HashMap;

public class search_sort4 {
   public static void main(String args[])
   {
    int nums[] = {3,1,4,1,5};
    int k = 2;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i: nums)
    {
        map.put(i, map.getOrDefault(i ,0)+1);
    }

    for(int a: map.keySet())
    {
        if(k!=0)
        {
            int b = a+k;
            if(map.containsKey(b))
            {
                count++;
            }
        }
        else
        { 
            if(map.get(a) > 1)
            {
                count++;
            }
        }
    }
    System.out.println("Count of k-diff pairs is: "+count);
   } 
}
