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
                rmax[b]=i;
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=0;i<n;i++){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]<=a){
                int b=st.pop();
                rmin[b]=i;
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]>a){
                int b=st.pop();
                lmax[b]=i;
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(st.size()>0 && arr[st.peek()]<a){
                int b=st.pop();
                lmin[b]=i;
            }
            st.push(i);
        }
        int mod=(int)Math.pow(10,9)+7;
        long sum=0l;
        for(int i=0;i<n;i++){
            int a=arr[i];
            int max=(rmax[i]-i)*(i-lmax[i]);
            int min=(rmin[i]-i)*(i-lmin[i]);
            long val=0l;
            val=(((max-min)*a)%mod)%mod;
            sum=(sum+val)%mod;
        }
        return (int)sum;
    }
}
