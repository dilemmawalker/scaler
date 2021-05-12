public class Solution {
    public int lengthOfLongestSubstring(String str) {
        int n=str.length();
        int p1=0;int p2=0;
        int max=0;
        HashSet<Character>map=new HashSet<>();
        while(p2<n){
            
            while(p2<n){
                char ch=str.charAt(p2);
                if(!map.contains(ch)){
                    max=Math.max(max,p2-p1+1);
                    map.add(ch);
                }
                else{
                    break;
                }
                p2++;
            }
            if(p2!=n){
                while(p1<n){
                char ch=str.charAt(p1);
                char ch2=str.charAt(p2);
                map.remove(ch);
                p1++;
                if(ch==ch2)
                break;
                }
                // map.add(str.charAt(p2));
            }
        }
        return max;

    }
}
