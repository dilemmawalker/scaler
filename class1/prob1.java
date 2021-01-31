import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int n){
      if(n==1||n==2){
        return 1;
      }

      int r=solve(n-1)+solve(n-2);

      return r;

    }
}