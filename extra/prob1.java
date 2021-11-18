import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int c=0,idx=3;
        while(c<n){
           int val=find(idx);
           System.out.print(val+" ");
           c++;
           idx=val;
        }
}
    public static int find(int idx){
        while(true){
            if(isprime(idx) && isprime(idx+2)){
                return idx+1;
            }
            idx++;
        }
    }
    public static boolean isprime(int no){
        int len=(int)Math.sqrt(no);
        int c=0;
        for(int i=1;i<=len;i++){
            if(no%i==0)
            c++;
        }
        if(c==1)
        return true;
        else
        return false;
    }
}
