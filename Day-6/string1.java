// Valid palindrome
public class string1 {
    public static void main(String args[]) 
    {
        String s = "A man, a plan, a canal: Panama";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) 
            {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) 
            {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
            {
                System.out.println("String is not palindrome");
                return; 
            }

            start++;
            end--;
        }

        System.out.println("String is palindrome");
    }
}