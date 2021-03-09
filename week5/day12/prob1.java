public class Solution {
	public long reverse(long a) {
        int n=32;
        long ans=0l;
        for(int i=0;i<32;i++){
            long mask=0l;
            mask=(1<<i);
            if((mask & a)!=0){
                int m=0;
                m=(1<<(31-i));
                ans=ans|m;
            }
        }
        return ans;
	}
}
