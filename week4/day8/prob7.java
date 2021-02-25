public class Solution {
    public int titleToNumber(String str) {
        int n=str.length();
        str=str.toLowerCase();
        long ans=0l;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            long s=0l;
            int diff=ch-'a';
            s=(long)Math.pow(26,n-i-1);
            s=(diff*s)+s;

            ans+=s;
        }

        return (int)ans;
    }
}
