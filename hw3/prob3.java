import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int []arr={};
        solve(arr);
    }
        public static int[] solve(int[] arr){
            int n=arr.length;
            if(n==1)
            return new int[1];

            int[]ans=new int[n];
            ArrayList<Integer>bb=new ArrayList<>();
            for(int i=0;i<n;i++){
                bb.add(arr[i]);
            }
            int c=0;
            // boolean[]bool=new boolean[n];
            for(int j=0;j<n-1;j++){
                if(bb.get(j)>=bb.get(j+1)){
                c++;
                // bool[j]=true;
                }
            }
            for(int i=0;i<n;i++){
                ans[i]=c;

                int aa=bb.remove(0);
                bb.add(aa);
                
                if(aa>=bb.get(0))
                c--;

                if(bb.get(n-2)>=aa){
                c++;
                }
            }
            return ans;
        }
}