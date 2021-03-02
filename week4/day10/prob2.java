import java.util.Scanner;
import java.util.ArrayList;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=100;
        
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int p=0;
        while(arr.size()>1){
            p++;
            if(arr.size()<=p)
            p%=arr.size();
            arr.remove(p);
        }
        System.out.println(arr.get(0));
    }
}