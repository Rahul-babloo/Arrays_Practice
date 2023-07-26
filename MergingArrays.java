package Practice;

import java.util.*;


class MerginggArrays {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int a[] = new int[n1];
        for(int i=0;i<n1;i++) {
            a[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int b[] = new int[n2];
        for(int i=0;i<n2;i++) {
            b[i] = in.nextInt();
        }
        int c[] = new int[n1+n2];
        for(int i=0;i<n1;i++) {
            c[i] = a[i];
        }
        for(int i=0;i<n2;i++) {
            c[n1+i] = b[i];
        }
        for(int i=0;i<n1+n2;i++) {
            System.out.print(c[i] + " ");
        }

    }
}