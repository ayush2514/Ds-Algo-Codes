import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        A[i]=0;
        for(int i=1;i<n;i++) {
            for(int j=i-1;j>=0;j--) {
                if(A[i]==A[j]) {
                    A[i+1]=i-j;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(A[i]+" ");
    }
}