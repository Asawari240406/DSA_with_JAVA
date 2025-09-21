// Print all the Duplicates in the Input String
public class string4
{    public static void main(String args[])
    {
        String str = "AABABCC";
        int left = 0;
        int[] freq = new int[26];
        int maxfreq = 0;
        int maxwindow = 0;
        int k =2;

        for(int right=0; right<str.length(); right++)
        {
            freq[str.charAt(right)-'A']++;
            maxfreq = Math.max(maxwindow,str.charAt(right)-'A');
            int windowlength = right - left + 1;

            if(windowlength - maxfreq > k)
            {
                freq[str.charAt(left)-'A']--;
                left++;
            }
            windowlength = right - left + 1;
            maxwindow = Math.max(maxwindow, windowlength);
        }
        System.out.println("Longest Repeating Character size is "+ maxwindow);
    }
}

    
