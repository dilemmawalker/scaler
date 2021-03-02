import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=100;
        int[]arr=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i)
            arr[j]=(arr[j]+1)%2;
        }
        int c=0;
        for(int i=0;i<=n;i++){
            if(arr[i]==1)
            c++;
        }
        System.out.println(c);
    }
}