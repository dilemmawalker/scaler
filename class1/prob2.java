import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        System.out.println(solve(5,n));
    }
    public static int solve(int a,int n){
     if(n==0){
        return 1;
     }

     int r=solve(a,n/2);
     if(n%2==0)
     r=r*r;
     else
     r=r*r*a;

     return r;
    }
}