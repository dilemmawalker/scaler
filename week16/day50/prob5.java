public class Solution {
    public int[] solve(int a) {
        int[]ans=new int[a];
        Queue<Integer>que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);

        int idx=0;
        while(que.size()<a){
            int b=que.remove();
            ans[idx++]=b;
            b*=10;
            que.add(b+1);
            que.add(b+2);
            que.add(b+3);
        }

        for(int i=idx;i<a;i++){
            ans[i]=que.remove();
        }
        return ans;
    }
}
