package Practice;

//Write a Java program that determines whether a given number is a pronic number
//        or not. A pronic number, also known as an oblong number or heteromecic
//        number, is a number that is the product of two consecutive integers.
//        The program should take an input number from the user and output
//        whether it is a pronic number or not. If it is a pronic number, the
//        program should also output the two consecutive integers whose product
//        is equal to the input number.

import java.util.Scanner;

public class PronicNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n/4;i++){
            if(i*(i+1)==n){
                count++;
                System.out.println(n+" is a pronic number");
                System.out.println(i+" x "+(i+1)+" = "+n);
            }
        }
        if(count==0){
            System.out.println(n+" is not a pronic number");
        }
    }
}
