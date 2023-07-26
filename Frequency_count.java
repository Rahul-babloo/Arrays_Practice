package Practice;

import java.util.Scanner;

public class Frequency_count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array to store the elements
        int[] arr = new int[size];

        // Take user input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an array to store the frequency of each element
        int[] frequency = new int[size];

        // Calculate the frequency of elements
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] == element) {
                    count++;
                }
            }
            frequency[i] = count;
        }

        // Print the element along with its frequency
        System.out.println("\nElement Frequency:");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i] + " appears " + frequency[i] + " time(s)");
            }
        }
    }
}



