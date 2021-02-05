import java.util.Scanner;
import java.util.ArrayList;
public class prob4{
public static void main(String[]args){
    String str="100001011";
    int a=solve(str);
    System.out.println(a);
}
public static int solve(String str){
    int n=str.length();
    int max=0;
    int c=0;
    int c2=0,c1=0;
    int total=0;
    ArrayList<Integer>arr=new ArrayList<>();
    for(int i=0;i<n;i++){
        char ch=str.charAt(i);
        if(ch=='1'){
        total++;
        c1++;
        if(c2!=0){
            if(c2==1)
            arr.add(0);
            else
            arr.add(-1);
            c2=0;
        }
        }
        else{
            c2++;
            if(c1!=0){
                arr.add(c1);
                c1=0;
            }
        }
        if(i+1==n){
            if(c1>0)
            arr.add(c1);
        }
    }
    n=arr.size();
    // for(int i=0;i<n;i++){
    //     System.out.print(arr.get(i)+" ");
    // }
    max=1;
    for(int i=0;i<n;i++){
        int a=arr.get(i);
        if(a==0){
            if((i-1>=0) && (i+1<n) && (arr.get(i-1)>0) && (arr.get(i+1)>0)){
                if((arr.get(i-1)+arr.get(i+1))<total)
            max=Math.max(max,(arr.get(i-1)+arr.get(i+1)+1));
            else if((arr.get(i-1)+arr.get(i+1))==total)
            max=Math.max(max,(arr.get(i-1)+arr.get(i+1)));
            }
        }
        else if(a>0){
            max=Math.max(max,(a+(total>a?1:0)));
        }
    }
    return max;
}
}