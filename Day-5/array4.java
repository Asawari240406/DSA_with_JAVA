import java.util.*;

public class array4 
{
    public static void generateCombinations(int[] arr, int r) 
    {
        List<Integer> current = new ArrayList<>();
        backtrack(arr, r, 0, current);
    }

    private static void backtrack(int[] arr, int r, int start, List<Integer> current) 
    {
        if (current.size() == r) 
        {
            System.out.println(current);
            return;
        }

        for (int i = start; i < arr.length; i++) 
        {
            current.add(arr[i]);
            backtrack(arr, r, i + 1, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4};
        int r = 2;
        generateCombinations(arr, r);
    }
}