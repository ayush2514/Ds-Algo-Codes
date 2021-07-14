import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int t=scr.nextInt();
        while(t-->0)
        {
            int n=scr.nextInt();
            int m=scr.nextInt();
              ArrayList<Integer> ar1=new ArrayList<Integer>();
              ArrayList<Integer> ar2=new ArrayList<Integer>();
              for(int i=1;i<=n;i++) 
                  ar1.add(i);
              for(int i=0;i<m;i++) {
                  ar2.add(scr.nextInt());
                  boolean isContain=ar1.contains(ar2.get(i));
                  if(isContain)
                  ar1.remove(ar1.indexOf(ar2.get(i)));
              }
             // System.out.println(ar1);
              for(int i=0;i<ar1.size();i++) {
                  if(i%2==0)
                  {
                  System.out.print(ar1.get(i)+" ");
                  }
              }
              System.out.println();
             for(int i=0;i<ar1.size();i++) {
                  if(i%2!=0)
                  {
                  System.out.print(ar1.get(i)+" ");
                  }
                      }
                      System.out.println(" ");
                  }
}
}