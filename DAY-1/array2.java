
// Reversing the elements of an array in Java.
public class array2 {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array elements are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(""+arr[i]);
        }

        int first = 0;
        int last = arr.length - 1;
        while (first < last )
        {
            int temp  = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        System.out.println("Array elements after reversing are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(""+arr[i]);
        }
    }
}
