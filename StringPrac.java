package Practice;

import java.util.Scanner;

public class StringPrac{

    int p=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // 12 999 1 123456 7 9998 2


        String arr[]=new String[n];
        int mx_len=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
            if(arr[i].length()>mx_len){
                mx_len=arr.length;
            }
        }


        for(int i=1;i<mx_len;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j].length()==i){
                    count++;
                }
            }
            System.out.print(i+" "+(count)+" ");
        }
    }
}