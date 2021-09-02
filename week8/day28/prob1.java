public class Solution {             //Square Root of Integer
    public int sqrt(int n) {        
                            //the changes do not  persist here since 
                            //we are not making static functions.
                            //so it's imp to put value  in static funtions for ans for 
                            //recursive functions always.           !!!!!important
        if(n==0 || n==1)
        return n;
        int ans=1;
         bs(n,1,n/2,ans);
         return (int)aa;
    }
    public long aa=-1;
    public void bs(long n,long lo,long hi,long ans){
        if(lo>=hi){
            if(lo==hi && (lo*lo)<=n){
            ans=lo;
            aa=lo;
            }
        return ;
        }

        long mid=(lo+hi)/2;
        long val=0l;
        val=mid*mid*1l;

        if(val<=n){
            ans=mid;
            aa=mid;
         bs(n,mid+1,hi,ans);
        }
        else{
             bs(n,lo,mid-1,ans);
        }
    }
}
