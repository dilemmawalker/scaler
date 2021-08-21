public class Solution { //Sum the Difference
    public int solve(ArrayList<Integer> arr) {
        int n=arr.size();
        Collections.sort(arr);

        long sum=0l;
        long s=0l;
        int mod=(int)Math.pow(10,9)+7;
        for (int i=0;i<n;i++){
            int a=arr.get(i);

              long aa=0l,bb=0l;
             aa=power(2,i,mod);
             bb=power(2,n-i-1,mod);

            long c=0l,d=0l;
            c=((aa*a)%mod + mod)%mod;
            d=((bb*a)%mod + mod)%mod;

            sum=((sum + c) + mod)%mod;
            s=((s + d) + mod)%mod;

        }
        return (int)((sum*1l-s*1l) + mod)%mod;
    }

     int power(long x, int y, int p){
  
    long res = 1; // Initialize result
 
    x = x % p; // Update x if it is more than or
    // equal to p
 
    if (x == 0)
      return 0; // In case x is divisible by p;
 
    while (y > 0)
    {
 
      // If y is odd, multiply x with result
      if ((y & 1) != 0)
        res = ((res * ((int)x))) % p;
 
      // y must be even now
      y = y >> 1; // y = y/2
      x = ((x * x)) % p;
    }
    return (int)res;
  }
}
