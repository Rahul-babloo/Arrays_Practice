package Practice;

import java.util.Scanner;


//Write a Java program to print the size of each array element.
//
//        Example: 1
//
//        input1:5
//
//        input2:  8 191 8888 21 15
//
//        output:  1 3 4 2 2

public class DisplaySize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];  // took long type to match the test cases
        long num;
        long rem;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            int count = 0;
            if (num == 0) {
                count++;
                System.out.print(count + " ");
            } else {
                while (num > 0) {
                    count++;
                    rem = num % 10;
                    num = num / 10;
                }
                System.out.print(count + " ");
            }
        }
    }
}
