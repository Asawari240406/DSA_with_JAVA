// Convert a Sentence into its Equivalent Mobile Numeric Keypad Sequence
public class string1 
{
    public static void main(String args[])
    {
        String s = "HELLO WORLD";
        String str[] = {"2", "22", "222", "3", "33", "333", "4", "44", "444", "5","55", "555"
            ,"6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999"
            , "9999"};
        String result = "";

            for(int i=0 ;i<s.length(); i++)
            {
                if(s.charAt(i) == ' ')
                {
                    result += "0";
                }
                else
                {
                    int indx = s.charAt(i)-'A';
                    result += str[indx];
                }
            }
        System.out.println("sentence-into-its-equivalent-mobile-numeric-keypad-sequence "+result);
    }
}