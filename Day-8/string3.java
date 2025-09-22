// Minimum Window Substring
// https://www.youtube.com/watch?v=3Bp3OVD1EGc
import java.util.HashMap;
import java.util.Map;

public class string3 {
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        
        // Example 1
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: \"" + solution.smallestWindow(s1, t1) + "\""); // Expected output: "BANC"

        // Example 2
        String s2 = "a";
        String t2 = "a";
        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: \"" + solution.smallestWindow(s2, t2) + "\""); // Expected output: "a"

        // Example 3
        String s3 = "a";
        String t3 = "aa";
        System.out.println("Input: s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: \"" + solution.smallestWindow(s3, t3) + "\""); // Expected output: ""
    }
}

class Solution {
    public String smallestWindow(String s, String t) 
    {
        int n = s.length();

        if (t.length() > n) 
        {
            return "";
        }

        Map<Character, Integer> mp = new HashMap<>();

        // store frequencies of characters in t
        for (char ch : t.toCharArray()) 
        {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int requiredCount = t.length();
        int i = 0, j = 0;

        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < n) 
        {
            char ch = s.charAt(j);

            if (mp.containsKey(ch) && mp.get(ch) > 0) 
            {
                requiredCount--;
            }

            mp.put(ch, mp.getOrDefault(ch, 0) - 1);

            while (requiredCount == 0) 
            {
                int currWindowSize = j - i + 1;

                if (minWindowSize > currWindowSize) 
                {
                    minWindowSize = currWindowSize;
                    start_i = i;
                }

                char startChar = s.charAt(i);
                mp.put(startChar, mp.getOrDefault(startChar, 0) + 1);

                if (mp.containsKey(startChar) && mp.get(startChar) > 0) 
                {
                    requiredCount++;
                }

                i++;
            }

            j++;
        }

        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + minWindowSize);
    }
}