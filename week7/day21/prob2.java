public class Solution {
    public int solve(ArrayList<Integer> arr) {
        int n=arr.size();
        Collections.sort(arr);

        long sum=0l;
        long s=0l;
        for (int i=0;i<n;i++){
            int a=arr.get(i);
            
            sum=(sum+(a*(int)(Math.pow(2,i)))%((int)Math.pow(10,9)+7))%((int)Math.pow(10,9)+7);
            sum%=((int)Math.pow(10,9)+7);
            s=(s+(a*(int)(Math.pow(2,n-i-1)))%((int)Math.pow(10,9)+7))%((int)Math.pow(10,9)+7);
            s%=((int)Math.pow(10,9)+7);
        }
        return (int)(sum-s);
    }
}
