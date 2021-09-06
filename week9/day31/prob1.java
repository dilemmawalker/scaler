public class Solution {                     //Count of pairs with the given sum
    public int solve(int[] arr, int b) {
        int n=arr.length;
        int p1=0,p2=n-1;
        int c=0;
        while(p1!=p2){
            int sum=arr[p1]+arr[p2];
            if(sum==b){
                c++;
                p1++;
            }
            else if(sum>b){
                p2--;
            }
            else{
                p1++;
            }
        }
        return c;
    }
}
