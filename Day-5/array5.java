import java.util.*;

class Query implements Comparable<Query> 
{
    int L, R, index;
    int blockSize;

    public Query(int L, int R, int index, int blockSize) 
    {
        this.L = L;
        this.R = R;
        this.index = index;
        this.blockSize = blockSize;
    }

    @Override
    public int compareTo(Query other) 
    {
        int block1 = this.L / blockSize;
        int block2 = other.L / blockSize;
        if (block1 != block2)
            return block1 - block2;
        return this.R - other.R;
    }
}

public class array5 {
    public static int[] processQueries(int[] arr, Query[] queries) 
    {
        int n = arr.length;
        int q = queries.length;
        int blockSize = (int) Math.sqrt(n);

        for (Query query : queries)
            query.blockSize = blockSize;

        Arrays.sort(queries);

        int[] freq = new int[1000001];
        int[] answers = new int[q];
        int currL = 0, currR = -1, distinctCount = 0;

        for (Query query : queries) {
            int L = query.L;
            int R = query.R;

            while (currL > L) 
            {
                currL--;
                freq[arr[currL]]++;
                if (freq[arr[currL]] == 1) distinctCount++;
            }

            while (currR < R) 
            {
                currR++;
                freq[arr[currR]]++;
                if (freq[arr[currR]] == 1) distinctCount++;
            }

            while (currL < L) 
            {
                freq[arr[currL]]--;
                if (freq[arr[currL]] == 0) distinctCount--;
                currL++;
            }

            while (currR > R) 
            {
                freq[arr[currR]]--;
                if (freq[arr[currR]] == 0) distinctCount--;
                currR--;
            }

            answers[query.index] = distinctCount;
        }

        return answers;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 1, 2, 1, 3};
        Query[] queries = {
            new Query(0, 4, 0, 0),
            new Query(1, 3, 1, 0),
            new Query(2, 4, 2, 0)
        };

        int[] result = processQueries(arr, queries);
        for (int res : result)
            System.out.println(res);
    }
}