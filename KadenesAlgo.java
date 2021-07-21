import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        A[i]=scr.nextInt();
        int gMaxSum=-(int)1e8;
        int rsum=0;
        int gsi=0;
        int gei=0;
        int rsi=0;
        for(int i=0;i<A.length;i++)
        {
            rsum+=A[i];
            if(rsum>gMaxSum)
            {
                gMaxSum=rsum;
               // rsi=i+1;
                gsi=rsi;
                gei=i;
            }
            if(rsum<=0) {
                rsum=0;
                rsi=i+1;
            }
        }
        for(int i=gsi;i<=gei;i++)
        System.out.print(A[i]+" ");
    }
}