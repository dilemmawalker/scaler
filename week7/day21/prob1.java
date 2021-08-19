public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(map.containsKey(a)){
                map.put(a,(map.get(a)+1));
            }
            else{
                map.put(a,1);
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            max=Math.max(max,map.get(a));
        }
        return max;
    }
}
