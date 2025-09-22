// find the longest palindrome from the string 
public class string1 {
    public static void main(String args[])
    {
        String str = "babadad";
        String LPS = "";
        
        if(str.length() <= 1)
        {
            System.out.println("Longesh Palindromic String is " + str);
            return;
        }

        for(int i=0; i<str.length(); i++)
        {
            //for odd
            int low = i;
            int high = i;

            while(low >= 0 && high < str.length() && str.charAt(high) == str.charAt(low))
            {
                String palindrome = str.substring(low, high+1);
                if(LPS.length() < palindrome.length())
                {
                    LPS = palindrome;
                }
                low--;
                high++;
            }

            //for even
            low = i;
            high = i+1;

            while(low >= 0 && high < str.length() && str.charAt(high) == str.charAt(low))
            {
                String palindrome = str.substring(low, high+1);
                if(LPS.length() < palindrome.length())
                {
                    LPS = palindrome;
                }
                low--;
                high++;
            }
        }
        System.out.println("Longesh Palindromic String is "+LPS);
    }
}
