// search in rotated sorted array
public class array1 {
    public static void main(String args[]) {
        int arr[] = {3,4,5,6,7,0,1,2,3};
        int n = arr.length;
        int k = 3;  // element to search
         
        int start = 0;
        int end = n - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }

            // Left half is sorted
            if (arr[mid] >= arr[start]) {
                if (k >= arr[start] && k < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (k > arr[mid] && k <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
