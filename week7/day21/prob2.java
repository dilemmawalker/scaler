public class Solution {
    public int solve(ArrayList<Integer> arr) {
        int n=arr.size();
        Collections.sort(arr);

        long sum=0l;
        long s=0l;
        int mod=(int)Math.pow(10,9)+7;
        for (int i=0;i<n;i++){
            int a=arr.get(i);
            
            sum= (sum+((a*power(2,i,mod)*1l + mod)%mod + mod)%mod + mod)%mod;
            s= (s+((a*power(2,n-i-1,mod)*1l + mod)%mod + mod)%mod + mod)%mod;
        }
        return (int)(sum-s+mod)%mod;
    }

     int power(int x, int y, int p){
  
    int res = 1; // Initialize result
 
    x = x % p; // Update x if it is more than or
    // equal to p
 
    if (x == 0)
      return 0; // In case x is divisible by p;
 
    while (y > 0)
    {
 
      // If y is odd, multiply x with result
      if ((y & 1) != 0)
        res = (res * x) % p;
 
      // y must be even now
      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }
}
