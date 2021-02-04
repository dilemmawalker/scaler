import java.util.Scanner;
public class prob2 {
   public static Scanner scn=new Scanner(System.in);
   public static void main(String[]args){
       int n=scn.nextInt();
       int[]arr={1,2};
       int a=solve(arr);
       System.out.println(a);
   }
   public static int solve(int[] arr) {
    int n=arr.length;
    int max=arr[n-1];
    int ans=arr[n-1]-arr[n-2];
    for(int i=n-1;i>=0;i--){
        int a=arr[i];
        ans=Math.max(ans,(max-a));
        max=Math.max(max,a);
    }
    return ans;
}
}
