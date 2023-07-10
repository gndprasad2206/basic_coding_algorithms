
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {7, 2, 1, 6, 8, 5, 3};

        quicksort(arr, 0, arr.length - 1);

        printArray(arr);

    }

 

    public static void quicksort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quicksort(arr, low, pivotIndex - 1);

            quicksort(arr, pivotIndex + 1, high);

        }

    }

 

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low + 1;

 

        for (int j = low + 1; j <= high; j++) {

            if (arr[j] < pivot) {

                swap(arr, i, j);

                i++;

            }

        }

 

        swap(arr, low, i - 1);

        printArray(arr);

        return i - 1;

    }

 

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;

    }

 

    public static void printArray(int[] arr) {

        for (int num : arr) {

            System.out.print(num + " ");

        }

        System.out.println();

    }

}
