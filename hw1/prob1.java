import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for(int i=2;i<=n;i++){
            int c=0;
            int no=i;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                c++;
                break;
                }
            }
            if(c==0)
            System.out.println(i);
        }
    }
}