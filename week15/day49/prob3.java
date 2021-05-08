public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int[]rmax=new int[n];
        int[]rmin=new int[n];
        int[]lmax=new int[n];
        int[]lmin=new int[n];
        for(int i=0;i<n;i++){
            rmax[i]=i+1;
            rmin[i]=i+1;
        }
        for(int i=n-1;i>=0;i--){
            lmax[i]=i-1;
            lmin[i]=i-1;
        }
        for(int i=0;i<n;i++){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]>=a){
                int b=st.pop();
                rmax[b]=a;
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=0;i<n;i++){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]<a){
                int b=st.pop();
                rmin[b]=a;
            }
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]>=a){
                int b=st.pop();
                lmax[b]=a;
            }
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]<a){
                int b=st.pop();
                lmin[b]=a;
            }
        }
        int mod=(int)Math.pow(10,9)+7;
        int sum=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            int max=rmax[i]-lmax[i]-1;
            int min=rmin[i]-lmin[i]-1;
            int val=(((max-min)*a)%mod+mod)%mod;
            sum=((sum+val%mod)%mod+mod)%mod;
        }
        return sum;
    }
}
