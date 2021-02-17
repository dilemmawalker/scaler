public class Solution {
    public int[] solve(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            max=Math.max(max,a);
        }
        boolean[]sieve=new boolean[max+1];
        int []ans=new int[max+1];
        int[]fans=new int[n];

        ans[0]=1;
        ans[1]=1;
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i<=max;i++){
                if(!sieve[i]){
                    int ele=i;
                    while(ele<=max){
                        if(!sieve[ele]){
                            sieve[ele]=true;
                            ans[ele]=i;
                        }
                        ele+=i;
                    }
                }
        }
        // for(int i=0;i<=max;i++){
        //     System.out.print(ans[i]+" ");
        // }
        int anss=1;
        for(int i=0;i<n;i++){
           
            int ele=arr[i];
            int a=ans[ele];
            int c=0;
            anss=1;
            int p=ans[ele];
            c=0;
            while(ele>1 && a>1){
                if(p!=a){
                    anss*=(c+1);
                    p=a;
                    c=1;
                }
                else{
                    c++;
                }
                ele=ans[ele/a];
                a=ans[ele];
            }
                anss*=(c+1);               
            fans[i]=anss;
        }
        return fans;
    }
}
