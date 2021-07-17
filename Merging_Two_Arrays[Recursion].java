import java.util.*;
public class Main {
    static void Merge(int A[],int left,int mid,int right) {
        int n1=mid-left+1;
        int n2=right-mid;
        int leftArray[]=new int[n1];
        int rightArray[]=new int[n2];
        for(int i=0;i<n1;++i)
        leftArray[i]=A[left+i];
        for(int j=0;j<n2;++j)
        rightArray[j]=A[mid+1+j];
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2) {
            if(leftArray[i]<=rightArray[j])
            A[k++]=leftArray[i++];
            else
            A[k++]=rightArray[j++];
        }
        while(i<n1)
        A[k++]=leftArray[i++];
        while(j<n2)
        A[k++]=rightArray[j++];
    }
    static void MergeSort(int A[],int left,int right)
    {
        if(left>=right)
        return;
        int mid=left+(right-left)/2;
        MergeSort(A,left,mid);
        MergeSort(A,mid+1,right);
        Merge(A,left,mid,right);
    }
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        A[i]=scr.nextInt();
        MergeSort(A,0,n-1);
        for(int i=0;i<n;i++)
        System.out.print(A[i]+" ");
            }
}
