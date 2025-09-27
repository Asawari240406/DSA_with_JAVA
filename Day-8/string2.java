// Total number of palindromic substrings in a given string
public class string2 {

    private int getPalindromeCount(String s, int low, int high)
    {
        int count = 0;
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) 
        {
            low--;
            high++;
            count++;
        }
        return count;
    }
    public int countPalindrome(String s)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            //for odd
            count += getPalindromeCount(s, i, i);

            //for even
            count += getPalindromeCount(s, i, i+1);
        }
        return count;
    }
    public static void main(String args[])
    {
        String str = "aaa";
        string2 obj1 = new string2();
        System.out.println("Total number of palindrome are " +obj1.countPalindrome(str));
    }
}
