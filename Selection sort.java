// SelectionSort.java
// Program to perform Selection Sort in Java

import java.util.Scanner;

public class SelectionSort {

    // Method to perform selection sort
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            // Assume the minimum element is at index i
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {

                // Update minIndex if smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform selection sort
        selectionSort(arr);

        // Display sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}
