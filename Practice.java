package Practice;

import java.util.Scanner;

public class Practice {
    int z=0;  // instance variable

    public static void main(String[] args) {

        int k=0;  // local variable

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //System.out.println(z);

        // 100 110 102 103 101 104 105

        int arr[]=new int[n];
        int od=0;
        int ev=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                od++;
            }
            else{
                ev++;
            }
            System.out.println(i);
        }


        int Even[]=new int[ev];
        int Odd[]=new int[od];

        int ev_index=0;
        int od_index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                Even[ev_index]=arr[i];
                ev_index++;
            }
            else{
                Odd[od_index]=arr[i];
                od_index++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(Even[i]!=0 && Odd[i]!=0){
                System.out.print(Even[i]+" ");
                System.out.print(Odd[i]+" ");
            }
        }

//        Practice ob=new Practice();
//
//
//
//        StringPrac obj=new StringPrac();
//        System.out.println(obj.p);
//        System.out.println(ob.z);
//        System.out.println(k);




    }
}
