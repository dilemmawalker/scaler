public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> arr) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.size();i++){
            int val=arr.get(i);
            st.push(val);
        }
        Stack<Integer>stn=new Stack<>();

        while(st.size()!=0){
            int val=st.pop();
            int idx=0;
            while(stn.size()!=0 && val<stn.peek()){
                int a=stn.pop();
                idx++;
                st.push(a);
            }
            stn.push(val);
            while(idx-->0){
                int a=st.pop();
                stn.push(a);
            }
        }
        while(stn.size()!=0){
            st.push(stn.pop());
        }

        arr=new ArrayList<Integer>();
        while(st.size()!=0){
            arr.add(st.pop());
        }
        return arr;
    }
}
