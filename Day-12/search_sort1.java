// Majority element in an array
import java.util.HashMap;

public class search_sort1
{
    public static void main(String args[])
    {
        int nums[] = {2,2,1,1,1,2,2};
        HashMap <Integer, Integer> map = new HashMap<>();
        int maxNum = -1;
        int max = nums.length /2;

        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int a : map.keySet())
        {
            if(map.get(a) > max)
            {
                maxNum = a;
            }
        }
        System.out.println("Majority element is: "+maxNum);
    }
}