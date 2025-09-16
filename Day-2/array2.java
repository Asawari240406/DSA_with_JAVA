// next permutation of an array
public class array2 {
    public static void main(String args[]) {
        int arr[] = {1,2,5,4,3};
        int n= arr.length;
        int pivote = -1;

        // find the pivot 
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                pivote = i;
                break;
            }
        }

        // if the array is decreasing order 
        if(pivote == -1) {
            int start = 0, end = n-1;
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            System.out.println("Sorted array");
            for(int i=0; i<n; i++) {
                System.out.print(arr[i] + " ");
            }       
            return;
        }

        // swap the pivot with the next greater element 
        for(int i=n-1; i>pivote; i--) {
            if(arr[i] > arr[pivote]) {
                int temp = arr[i];
                arr[i] = arr[pivote];
                arr[pivote] = temp;
                break; 
            }
        }

        // reverse the remaining part after the pivot position
        int start = pivote + 1, end = n-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Next permutation of the number is:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
