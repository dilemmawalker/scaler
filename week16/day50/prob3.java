public class Solution {
    public String solve(String str) {
        int n=str.length();
        String ans="";
        int[]arr=new int[26];
        Queue<Character>que=new LinkedList<>();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
            if(arr[ch-'a']==1){
                que.add(ch);
            }
            while(que.size()>0 && arr[que.peek()-'a']>1){
                que.remove();
            }
            if(que.size()!=0){
                sb.append(que.peek());
            }
            else{
                sb.append('#');
            }
        }
        return sb.toString();
    }
}
