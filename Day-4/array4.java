// overlap intervals and merge them into one if they do.
import java.util.*;

public class array4 {
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        ArrayList<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) 
        {
            if (interval[0] <= newInterval[1]) 
            {
                
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } 
            else 
            {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        System.out.println("Merged Intervals:");
        for (int[] interval : result) 
        {
            System.out.println(Arrays.toString(interval));
        }
    }
}
