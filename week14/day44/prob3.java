public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n=A.size();
        sol(A,0,n-1);
        return A;
    }
    public void sol(ArrayList<Integer>arr,int s,int end){
        int n=arr.size();
        if(s==(n/2))
        return ;

        int temp=arr.get(s);
        arr.set(s,arr.get(end));
        arr.set(end,temp);
        sol(arr,s+1,end-1);
    }
}
