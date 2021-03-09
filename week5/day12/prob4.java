public class Solution {
    public int[] solve(int[] arr) {
        int n=arr.length;
        int a=0;
        int b=0;
        int x=0;
        for(int i=0;i<n;i++){
            int ele=arr[i];
            x^=ele;
        }

        for(int i=0;i<=30;i++){
            int mask=1<<i;
            if((mask & x)!=0){
                for(int j=0;j<n;j++){
                    int ele=arr[j];
                    if((ele & (1<<i))!=0){
                        a^=ele;
                    }
                    else{
                        b^=ele;
                    }
                }
                break;
            }
        }
        int[]ar=new int[2];
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        ar[0]=min;
        ar[1]=max;
        return ar;
    }
}
