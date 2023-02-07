package Search;

public class BinarySearch {
    
    public static int search(int[] arr, int toFind) {
        int l = 0, r = arr.length - 1;
        
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] == toFind)
                return mid;
            if(arr[mid] < toFind)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void print(int[] arr,int toFind) {
        int output = BinarySearch.search(arr, toFind);
        if(output == -1) {
            System.out.println("Element "+ toFind+" not found");
        } else {
            System.out.println("Element "+ toFind +" found at Index " + output);
        }
    }
}
