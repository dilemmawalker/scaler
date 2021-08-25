public class Solution {                 //Min Swaps 2
    public int solve(int[] arr) {
        int n=arr.length;
        int[]idxarr=new int[n];

        for(int i=0;i<n;i++){
            int a=arr[i];
            idxarr[a]=i;
        }
        int c=0;

        for(int i=0;i<n;i++){
            int a=arr[i];
            if(i!=a){
                c++;
                int b=idxarr[i];
                swap(arr,i,b);
                swap(idxarr,i,a);
            }
        }
        return c;
    }
    public void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
