// Wildcard String Matching.
class Solution {
    static boolean match(String pat, String txt) 
    {
        int m = pat.length();
        int n = txt.length();
          
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for (int i = 1; i <= m; i++) 
        {
            if (pat.charAt(i - 1) == '*') 
            {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int i = 1; i <= m; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                char pc = pat.charAt(i - 1);
                char tc = txt.charAt(j - 1);

                if (pc == tc || pc == '?') 
                {
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                else if (pc == '*') 
                {

                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }

        return dp[m][n];
    }
}

public class string4 {
    public static void main(String[] args) 
    {
        String pat = "ge?ks*";
        String txt = "geeksforgeeks";

        boolean res = Solution.match(pat, txt);
        System.out.println(res ? "Yes" : "No");
    }
}
