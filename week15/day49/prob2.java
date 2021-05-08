public class Solution {
    public String solve(String str) {
        int n=str.length();
        boolean[]vis=new boolean[26];
        Stack<Character>st=new Stack<>();
        int[]freq=new int[26];

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch-'a']--;
            while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>0){
                char c=st.pop();
                vis[c-'a']=false;
            }
            if(!vis[ch-'a']){
            st.push(ch);
            vis[ch-'a']=true;
            }
        }

        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            char ch=st.pop();
            sb.append(ch);
        }
        sb.reverse();
        return sb.toString();
    }
}
