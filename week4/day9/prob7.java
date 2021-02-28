public class Solution {
    public int[] solve(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=arr[i];
            max=Math.max(max,a);
        }
        int[]spf=new int[max+1];
        spf[0]=1;
        spf[1]=1;
        for(int i=2;i*i<=max;i++){
            int a=i;

            if(spf[i]!=0)
            continue;

            spf[i]=i;
            int idx=i;
            while(idx<=max){
                if(spf[idx]==0)
                spf[idx]=a;
                idx+=i;
            }
        }
        for(int i=2;i<=max;i++){
            int a=i;

            if(spf[i]!=0)
            continue;

            spf[i]=i;
            
        }

        for(int i=0;i<n;i++){
            int a=arr[i];

            int ans=1;
            int c=0;
            int p=spf[a];
            while(a>=2){
                int curr=spf[a];
                if(p==curr){
                    c++;
                }
                else{
                    ans*=(c+1);
                    c=1;
                    p=curr;
                }
                a/=curr;
            }
            // if(arr[i]>=2)
            ans*=(c+1);

            arr[i]=ans;
        }
        return arr;
    }
}
