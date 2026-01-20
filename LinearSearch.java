// LinearSearch.java
// Program to perform Linear Search on an array

import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search
    static int linearSearch(int[] arr, int key) {

        // Traverse each element one by one
        for (int i = 0; i < arr.length; i++) {

            // If element is found, return index
            if (arr[i] == key) {
                return i;
            }
        }

        // If element not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Call linear search method
        int result = linearSearch(arr, key);

        // Display result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
