public class Solution {
    public int solve(int ele) {
        int a=0,b=0;
        int pos=0;
        for(int i=0;i<32;i++){
            int mask=(1<<i);
            if((ele & mask)!=0){
                pos=i;
            }
        }
//
        int y=(1<<(pos+1));
        int x=0;
        for(int i=0;i<pos;i++){
            int mask=(1<<i);
            if((ele & mask)==0){
                x|=mask;
            }
        }
        return x^y;
    }
}
