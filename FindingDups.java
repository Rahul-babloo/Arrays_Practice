package Practice;


//write a java program to find the array duplicate elements?
//
//        EX:
//
//        INPUT1: 6
//
//        INPUT2: 1 9 1 9 9 1
//
//        OUTPUT : 1 1 9 9 1 9

import java.util.Scanner;

public class FindingDups {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }

    }
}
