public class Solution {
    public int solve(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]!=0){
                    c++;
                }
                else
                c=0;

                arr[j][i]=c;
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            // int[]ar=new int[m];
            // for(int i=0;i<m;i++){

            // }
        max=Math.max(max,largestRectangleArea(arr[i]));
        }
        return max;
    }
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int[] lmin=new int[n];
        int[] rmin=new int[n];

        Stack<Integer>st=new Stack<>();

        for(int i=0;i<n;i++){
            rmin[i]=n;
        }
        for(int i=0;i<n;i++){
            int a=arr[i];
            while(st.size()!=0 && arr[st.peek()]>a){
                int b=st.pop();
                rmin[b]=i;
            }
            st.push(i);
        }
        st=new Stack<Integer>();
        
        for(int i=0;i<n;i++){
            lmin[i]=-1;
        }
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(st.size()!=0 && arr[st.peek()]>a){
                int b=st.pop();
                lmin[b]=i;
            }
            st.push(i);
        }

        int val=0;
        for(int i=0;i<n;i++){
            int cval=rmin[i]-1-(lmin[i]+1)+1;
            val=Math.max(val,cval*arr[i]);
            val=Math.max(val,arr[i]);
        }
        return val;
    }
}
