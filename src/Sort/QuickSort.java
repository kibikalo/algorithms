package Sort;

public class QuickSort {
    
    public static void sort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = hoarePartition(arr, low, high);

            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    private static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];

        int i = low - 1;
        int j = high + 1;

        while(true) {
            do {
                i++;
            } while (i <= high && arr[i] < pivot);

            do {
                j--;
            } while (j >= low && arr[j] > pivot);

            if(i >= j)
                return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
