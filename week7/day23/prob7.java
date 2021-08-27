public class Solution {                     //Max Distance
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] arr) {
        int n=arr.length;
        int[]ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=i;
        }

        sort(arr,ar,0,n-1);//sort on basis of arr

        int max=ar[n-1];
        int omax=0;
        for(int i=n-2;i>=0;i--){
            omax=Math.max(max-ar[i],omax);
            max=Math.max(max,ar[i]);
        }
        return omax;
    }
    public void sort(int[]arr,int[]ar,int lo,int hi){
        if(lo==hi)
        return;

        int mid=(lo+hi)/2;
        sort(arr,ar,lo,mid);
        sort(arr,ar,mid+1,hi);

        merge(arr,ar,lo,mid+1,hi);
    }
    public void merge(int[]arr,int []ar,int lo,int mid,int hi){
        int n=hi-lo+1;
        int[]temp=new int[n];
        int[]tem=new int[n];

        int p1=lo,p2=mid;
        int idx=0;
        while(p1<mid && p2<=hi){
            int a=arr[p1];
            int b=arr[p2];

            if(a<=b){
                temp[idx]=a;
                tem[idx++]=ar[p1];
                p1++;
            }
            else{
                temp[idx]=b;
                tem[idx++]=ar[p2];
                p2++;
            }
        }
        while(p1<mid){
            temp[idx]=arr[p1];
            tem[idx++]=ar[p1];
            p1++;
        }
        while(p2<=hi){
            temp[idx]=arr[p2];
            tem[idx++]=ar[p2];
            p2++;
        }
        for(int i=0;i<n;i++){
            arr[lo]=temp[i];
            ar[lo++]=tem[i];
        }
    }
}
