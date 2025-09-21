// Print all the duplicate characters in a string
import java.util.*;

public class string2 {
    public static void main(String args[])
    {
        String s = "geeksforgeeks";
        HashMap <Character, Integer> freq = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }

        for(Map.Entry<Character, Integer> kv : freq.entrySet())
        {
            if(kv.getValue() > 1)
            {
                System.out.print("['"+ kv.getKey() + "','" + kv.getValue() + "']");
            }
        }
    }
}
