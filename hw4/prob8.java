import java.lang.*;
import java.util.*;

public class Main {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int b=scn.nextInt();
            
            
            if(n==0||n==1){
                System.out.println();
            continue;
            }
            
            b%=n;

            int p1=0;int p2=n-1;
            while(p1<p2){
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;
            }
            p1=0;p2=b-1;
            while(p1<p2){
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
               p1++;
                p2--;
            }
            p1=b;p2=n-1;
            while(p1<p2){
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;
            }

            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}