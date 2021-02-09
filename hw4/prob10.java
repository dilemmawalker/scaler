public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=arr[i];
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        int mi=-1,ma=-1;
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a==min){
                mi=i;
                break;
            }
            else if(a==max){
                ma=i;
                break;
            }
        }

        if(max==min){
            return 1;
        }
        int ans=n+1;
        while(mi<n && ma<n){
            if(mi<ma){
                ++mi;
                while(mi<n && arr[mi]!=min){
                    mi++;
                }
                if(mi<n){
                    int b=mi-ma;
                    if(b<0)
                    b=-b;
                    ans=Math.min(ans,b);
                }
            }
            else{
                ++ma;
                while(ma<n && arr[ma]!=max){
                    ma++;
                }
                if(ma<n){
                    int b=mi-ma;
                    if(b<0)
                    b=-b;
                    
                    ans=Math.min(ans,b);
                }
            }
        }
        return ans+1;
    }
}
