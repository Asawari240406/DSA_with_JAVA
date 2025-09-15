// Simple approach.
/* 
public class array1
{   
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 7, 9, 18};

        // Print array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if(arr.length == 1){
            min =arr[0];
            max =arr[0];
        }
        else{
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        }
        // Print min and max
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

*/

// tournament method approach 
public class array1 {
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 7, 9, 18};
        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int i = 0;
        int max, min;

        if (arr.length % 2 == 0) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
                min = arr[i + 1];
            } else {
                max = arr[i + 1];
                min = arr[i];
            }
            i = 2;
        } else {
            max = arr[0];
            min = arr[0];
            i = 1;
        }

        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            }
            i = i + 2;  
        }

        System.out.println("Minimum array element is " + min);
        System.out.println("Maximum array element is " + max);
    }
}
