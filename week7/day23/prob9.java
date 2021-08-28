public class Solution {             //Arithmetic Progression?
    public int solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);

        int dis=0;
        dis=arr[1]-arr[0];
        for(int i=1;i<n;i++){
            int a=arr[i];
            int b=arr[i-1];
            int val=a-b;
            if(val!=dis)
            return 0;
        }
        return 1;
    }
}
