// valid panagram
public class string2 {
    public static void main(String args[])
    {
        String s = "anagram";
        String t = "nagaram";
        int count[] = new int[26];
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) 
        {
            System.out.println("Strings are not anagram");
            return;
        }

        for(int i=0; i<n1; i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++)
        {
            if(count[i] != 0)
            {
                System.out.println("Strings are not anagram");
                return;
            }
        }
        System.out.println("Strings are anagram");
    }
}
