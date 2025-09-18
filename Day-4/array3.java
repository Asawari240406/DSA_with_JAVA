// Kth smallest element in an array using Max_heap 
import java.util.Collections;
import java.util.PriorityQueue;

public class array3 {
    public static void main(String args[])
    {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int n = arr.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n ; i++)
        {
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k)
            {
                maxHeap.poll();
            }
        }
        System.out.println("Kth smallest element is : "+ maxHeap.peek());

    }
}
