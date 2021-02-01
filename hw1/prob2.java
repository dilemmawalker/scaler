import java.util.Scanner;
import java.util.ArrayList;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    System.out.print(i+" ");
                    arr.add(n/i);
                }
            }
            int no=arr.size();
            for(int i=no-1;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}