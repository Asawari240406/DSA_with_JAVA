// find the longest common prefix from the Strings array
import java.util.*;
public class string5 {
    public static void main(String args[])
    {
        String[] strs = {"cat", "call", "calm"};
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i=0; i<first.length; i++)
        {
            if(first[i] != last[i])
            {
                break;
            }
            else
            {
                result.append(first[i]);
            }
        }
        System.out.println("longest common prefix is "+ result.toString());
    }
}
