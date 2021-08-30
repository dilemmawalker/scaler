public class Solution {
    public int[] solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);

        boolean flag;
        for(int  i=n-1;i>=2;i--){
                int a=arr[i];
                int b=arr[i-1];
                int c=arr[i-2];
                int g=gcd(c,b);

                if(a!=(g+b)){
                    flag=true;
                    break;
                }
        }
        if(flag)
        return new int{-1};
        return arr;
    }
    public int gcd(int a,int b){
        if(a==0)
        return b;

        return gcd(a%b,a);
    }
}
