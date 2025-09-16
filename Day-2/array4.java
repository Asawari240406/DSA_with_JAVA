// finding kth larget element in an array
import java.util.PriorityQueue;

public class array4 {
    public static void main(String args[])
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int arr[] = {1,2,3,4,5};
        int k=2;

        for(int i=0; i<arr.length; i++)
        {
            minHeap.add(arr[i]);
            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }
        System.out.println("kth larget element is "+minHeap.peek());
    }
}
