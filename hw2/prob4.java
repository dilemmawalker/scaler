import java.util.Scanner;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int[]arr={28, 18, 44, 49,41, 14,49};
        int aa=solve(arr);
        System.out.println(aa);
    }
    public static int c=0;
    public static int solve(int[] arr) {
        int n=arr.length;
        breaking(arr,0,n-1);
        int mod=(int)Math.pow(10,9)+7;
        return c%mod;
    }
    public static void breaking(int[]arr,int l,int r){
        if(l<r){
        int m=l+(r-l)/2;

        breaking(arr,l,m);
        breaking(arr,m+1,r);

         merge(arr,l,m,r);
        }
    }
    public static void merge(int[]arr,int l,int m,int r){
        int n=arr.length;

        int n1=m-l+1;
        int n2=r-m;
        int mod=(int)Math.pow(10,9)+7;

        int []L=new int[n1];
        int[]R=new int[n2];

        for(int i=0;i<n1;i++)
        L[i]=arr[l+i];
        for(int j=0;j<n2;j++)
        R[j]=arr[m+1+j];

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
                // c+=(n1-i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        i=0;j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                i++;
            }
            else{
                j++;
                c+=(n1-i);
                c%=mod;
            }
        }
    }
}