public class Solution {             //unique elements
    public int solve(int[] arr) {
        int n=arr.length;
        int count=0;
        sort(arr);
        for(int i=1;i<n;i++){
            int a=arr[i];
            int p=arr[i-1];

            if(p>=a){
                int val=p+1;
                count+=val-a;
                arr[i]=val;
            }
        }
        return count;
    }

    public void sort(int[]arr){    //my array sort function
        int n=arr.length;
        sortt(arr,0,n-1);
    }
    public void sortt(int[]arr,int lo,int hi){ 
        if(lo==hi)
        return;

        int mid=(hi+lo)/2;
        sortt(arr,lo,mid);
        sortt(arr,mid+1,hi);
         
         merge(arr,lo,mid+1,hi);
    }
    public void merge(int[]arr,int lo,int mid,int hi){
        int n=hi-lo+1;
        int[]ar=new int[n];
        int p1=lo,p2=mid;
        int p=0;
        
        while(p1<mid && p2<=hi){
            int a=arr[p1];
            int b=arr[p2];

            if(a<b){
                ar[p++]=a;
                p1++;
            }
            else{
                ar[p++]=b;
                p2++;
            }
        }
        
        while(p1<mid){
            int a=arr[p1];

            ar[p++]=a;
            p1++;
        }
        while(p2<=hi){
            int b=arr[p2];

            ar[p++]=b;
            p2++;
        }
        for(int i=0;i<n;i++){
            arr[lo++]=ar[i];
        }
    }
}
