// countArray method to sort an array of integers. 
public class search_sort2 {
    public static void main(String args[])
    {
        int arr[] = {3,4,1,3,2,5,2,8};

        if(arr.length <= 0 || arr == null)
        {
            System.out.println("Array is empty");
            return;
        }

        int largest = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }

        int countArray[] = new int[largest+1];

        for(int i=0; i<arr.length; i++)
        {
            countArray[arr[i]]++;
        }

        int idx = 0;

        for(int i=0; i<arr.length; i++)
        {
            while(countArray[i] > 0)
            {
                arr[idx] = i;
                idx++;
                countArray[i]--;
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]+" ");
        }
    }
}
