import java.util.Scanner;
public class prob6{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int no=scn.nextInt();
        int a=solve(no);
        System.out.println(a);
    }
    public  static int solve(int no){
        int n=no;
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        
        int sum=0;
        n=(int)Math.pow(10,c);
        // int mod=(int)Math.pow(10,9)+7;
        while(n>=10){
            
        int a=(no/n)*(n/10);
        a+=Math.min(Math.max(((no%n) -(n/10)+1),0),(n/10));
        sum+=a;
        n/=10;
        // sum%=mod;
        }

        return sum;
    }
}