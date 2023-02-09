import java.util.Arrays;
import java.util.Random;

import Search.BinarySearch;
import Sort.QuickSort;
import Sort.SelectionSort;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr1 = getRandomNumbers();
        int[] arr2 = getRandomNumbers();

        System.out.println("Selection Sort");
        System.out.println("Unsorted: " + Arrays.toString(arr1));
        SelectionSort.sort(arr1);
        System.out.println("Sorted: " + Arrays.toString(arr1));
        
        System.out.println("Binary Search");
        BinarySearch.print(arr1, 51);

        System.out.println("Quick Sort");
        System.out.println("Unsorted: " + Arrays.toString(arr2));
        QuickSort.sort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr2));
    }

    public static int[] getRandomNumbers() {
        int[] randomNumbers = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = rnd.nextInt(100); 
        }
        return randomNumbers;
    }
}
