import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
          int n=scr.nextInt();
          int k=scr.nextInt();
          int A[]=new int[n];
          int maxsum=0;
          for(int i=0;i<n;i++)
          A[i]=scr.nextInt();
          for(int i=0;i<n-k+1;i++) {
              int sumArray=0;
              for(int j=i;j<i+k;j++) {
               sumArray+=A[j];
              }
              if(sumArray>maxsum) {
                  maxsum=sumArray;
              }
          }
          System.out.println(maxsum);
    }
}