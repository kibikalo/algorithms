import Search.BinarySearch;
import Sort.SelectionSort;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 
                    10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        
        System.out.println("Unsorted");
        printArray(arr);
        SelectionSort.sort(arr);
        System.out.println("Sorted");
        printArray(arr);

        BinarySearch.print(arr, 32);
        BinarySearch.print(arr, 10);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
