// group Anagrams
import java.util.*;
public class string5 
{
    public String getStringFrequency (String str)
    {
        int[] freq = new int[26];
        for(char ch : str.toCharArray())
        {
            freq[ch - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        char c = 'a';
        for(int i : freq)
        {
            result.append(c);
            result.append(i);
            c++;
        } 
        return result.toString();
    }
    public List <List<String>> groupAnagrams(String[] strs)
    {
        Map <String, List<String>> StringFrequencyMap = new HashMap<>();
        for(String str : strs)
        {
            String strFreq = getStringFrequency(str);
            if(StringFrequencyMap.containsKey(strFreq))
            {
                StringFrequencyMap.get(strFreq).add(str);
            }
            else
            {
                List<String> strlist = new ArrayList<>();
                strlist.add(str);
                StringFrequencyMap.put(strFreq, strlist);
            }
        }
        return new ArrayList<>(StringFrequencyMap.values());
    }
     public static void main(String args[]) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        string5 obj = new string5();
        List<List<String>> group = obj.groupAnagrams(strs);

        for (List<String> list : group) {
            System.out.println(list);
        }
    }
}