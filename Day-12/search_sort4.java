// Count Number of inversions in an array using Merge Sort.
class search_sort4 
{
    static int inversionCount(int arr[]) 
    {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static int mergeSort(int arr[], int s, int e) 
    {
        int counter = 0;
        if (s < e) 
        {
            int mid = s + (e - s) / 2;
            counter += mergeSort(arr, s, mid);
            counter += mergeSort(arr, mid + 1, e);
            counter += merge(arr, s, mid, e);
        }
        return counter;
    }

    public static int merge(int[] arr, int s, int mid, int e) 
    {
        int counter = 0;

        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) 
        {
            L[i] = arr[s + i];
        }
        for (int j = 0; j < n2; j++) 
        {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = s;


        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            } 
            else 
            {
                arr[k] = R[j];
                counter += (n1 - i); 
                j++;
            }
            k++;
        }

        while (i < n1) 
        {
            arr[k++] = L[i++];
        }

        while (j < n2) 
        {
            arr[k++] = R[j++];
        }

        return counter;
    }

    public static void main(String[] args) 
    {
        int arr[] = {2, 4, 1, 3, 5};
        int result = inversionCount(arr);
        System.out.println("Number of inversions: " + result);
    }
}
