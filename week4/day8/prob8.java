public class Solution {
    public int trailingZeroes(int a) {
        int no=5;
        int ans=0;
        while(a>=no){
            ans+=a/no;
            no*=5;
        }
        return ans;
    }
}
