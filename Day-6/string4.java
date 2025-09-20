// remove the consecutive characters from the string
public class string4 {
    public static void main(String args[])
    {
        String s = "aaaabc";
        StringBuilder result = new StringBuilder();
        int n = s.length();

        for(int i=0; i<n; i++)
        {
            if(i < n-1 && s.charAt(i) == s.charAt(i+1) )
            {
                continue;
            }
            else
            {
                result.append(s.charAt(i));
            }
        }
        System.out.println("consecutive elements are "+result.toString());

    }
}
