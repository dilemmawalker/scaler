public class Solution {
    public int solve(int[] arr, int[] b) {
        int n=arr.length;
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++){
            que.add(arr[i]);
        }
        int idx=0;
        int c=0;

        while(idx<n){
            c++;
            if(que.peek()==b[idx]){
                que.remove();
                idx++;
            }
            else{
                int a=que.remove();
                que.add(a);
            }
        }
        return c;
    }
}
