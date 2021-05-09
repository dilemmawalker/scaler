public class Solution {
    public String solve(int no) {
        String str="";
        
        Queue<String>que=new LinkedList<>();
        if(no==1)
        return "11";
        else if(no==2)
        return "22";

        que.add("11");
        que.add("22");

        int idx=1;
        while(idx!=no){
            String rm=que.remove();

            int n=rm.length();
            String sf=rm.substring(0,n/2);
            String sl=rm.substring(n/2);

            que.add(sf+"11"+sl);
            que.add(sf+"22"+sl);

            idx++;
        }
        return que.remove();
    }
}
