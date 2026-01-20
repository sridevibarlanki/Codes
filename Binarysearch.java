// BinarySearch.java
// Program to perform Binary Search on a sorted array

import java.util.Scanner;

public class BinarySearch {

    // Method to perform binary search
    static int binarySearch(int[] arr, int key) {
        int low = 0;                 // starting index
        int high = arr.length - 1;   // ending index

        while (low <= high) {
            int mid = (low + high) / 2;  // find middle index

            // If key is found at mid
            if (arr[mid] == key) {
                return mid;
            }
            // If key is greater, search in right half
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            // If key is smaller, search in left half
            else {
                high = mid - 1;
            }
        }
        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input sorted array elements
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Call binary search method
        int result = binarySearch(arr, key);

        // Display result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
