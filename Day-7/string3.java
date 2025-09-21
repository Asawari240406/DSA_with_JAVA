// Longest Substring length without repeating character 
import java.util.HashSet;
import java.util.Set;

public class string3 {
    public static void main(String args[])
    {
        Set <Character> charset = new HashSet<>();
        String s = "pwwkewxpw";
        int maxlen = 0;
        int left =0;
        for(int right=0; right<s.length(); right++)
        {
            while(charset.contains(s.charAt(right)))
            {
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(right));
            maxlen = Math.max(maxlen, right-left+1);
        }
        System.out.println("Longest Substring without repeating character " + maxlen);
    }
}
