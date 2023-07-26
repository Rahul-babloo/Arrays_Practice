package Practice;


//Write a Java program to print the product of even numbers only
//
//        Example:
//
//        input1: 5
//
//        input2: 9 12 1 19 22
//
//        output: 2 4


import java.util.Scanner;

public class EvenProd {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int num;
        int rem;
        int even_count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            num=arr[i];
            int prod=1;
            if(arr[i]%2==0){
                even_count++;
                while(num>0){
                    rem=num%10;
                    prod*=rem;
                    num=num/10;
                }
                System.out.print(prod+" ");
            }
        }
        if(even_count==0){
            System.out.println("No Even Numbers");
        }
    }
}
