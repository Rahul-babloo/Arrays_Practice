package Practice;
// need to find out the leaderboard position program

import java.util.Scanner;

public class LeaderBoard {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=arr.length-1;i>=0;){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
                    System.out.print(arr[j]+" ");
                    i=j;
                    break;
                }
            }
        }
    }
}
