import java.util.*;
public class Main {
    //Memoization Approach
    public static int fibn(int n)
    {
        int Dp[]=new int[n+1];
        for(int i=0;i<Dp.length;i++)
           Dp[i]=-1;
        if(n<=1)      return n;
         if(Dp[n]!=-1)   return Dp[n];
        return Dp[n]=fibn(n-1)+fibn(n-2);
    }*/
    //Tabulation Approach
    public static int fibn(int n)
    {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++)
           dp[i]=-1;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }*/
    //Space Optimizer 
    public static int fibn(int n)
    {
        int prev=1;
        int prep=0;
        if(n<=1)
         return n;
        for(int i=2;i<=n;i++)
        {
            int c=prev+prep;
             prep=prev;
             prev=c;
             
        }
        return prev; 
    }
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int x=fibn(n);
        System.out.println(x);
    }
}