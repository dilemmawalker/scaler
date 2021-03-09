public class Solution {
    public int findMinXor(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int n=arr.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int a=arr.get(i);
            int b=arr.get(i+1);
            min=Math.min(min,a^b);
        }
    }
}
