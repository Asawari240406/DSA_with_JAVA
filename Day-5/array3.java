import java.util.HashMap;

public class array3 
{
    public static int longestSubarray(int[] nums, int k) 
    {
        HashMap<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);

        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            prefixSum += nums[i];
            int remainder = ((prefixSum % k) + k) % k;

            if (remainderIndexMap.containsKey(remainder)) 
            {
                int prevIndex = remainderIndexMap.get(remainder);
                maxLength = Math.max(maxLength, i - prevIndex);
            } 
            else 
            {
                remainderIndexMap.put(remainder, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2, 7, 6, 1, 4, 5};
        int k = 3;
        System.out.println("Longest subarray length: " + longestSubarray(nums, k));
    }
}