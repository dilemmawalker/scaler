public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int[]arrb=new int[n];
        int idx=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            int val=arr[i];
            if(idx==0){
                if(val==1){
                    arrb[idx++]=val;
                }
                else{
                    st.add(val);
                }
            }
            else{
                if(arrb[idx-1]==(val-1)){
                    arrb[idx++]=val;
                }
                else{
                    st.push(val);
                }
            }
            while(st.size()!=0 && idx!=0 && st.peek()==arrb[idx-1]+1){
                int a=st.pop();
                arrb[idx++]=a;
            }
        }
        
        for(int i=0;i<n;i++){
            int val=arrb[i];
            if(val!=(i+1))
            return 0;
        }
        return 1;
    }
}
