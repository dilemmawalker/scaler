public class Solution {                     //Maximum Unsorted Subarray       
                                            //incorrect soln. till now.
    public int[] subUnsort(int[] arr) {     //without using extra space.
        int n=arr.length;

        boolean flag=false;
        for(int i=1;i<n;i++){
            int a=arr[i];
            if(a<arr[i-1] && flag==false){
                flag=true;
                sort(arr,0,n-1);
            }
        }
        if(!flag){
            return new int[]{-1};
        }
        else{
            return new int[]{p1,p2};
        }
    }
    public int p1=Integer.MAX_VALUE,p2=-1;
    public void sort(int[]arr,int lo,int hi){
        int n=arr.length;

        if(lo==hi){
            return;
        }
        int mid=(lo+hi)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);

        merge(arr,lo,mid+1,hi);
    }
    public void merge(int[]arr,int lo,int mid,int hi){
        int n=arr.length;
        int s=hi-lo+1;
        int[]copy=new int[s];
        int idx=0;

        int pp1=lo,pp2=mid;
        while(pp1<mid && pp2<=hi){
            int a=arr[pp1];
            int b=arr[pp2];

            if(a<=b){
                copy[idx]=a;
                pp1++;
                
            }
            else{
                copy[idx]=b;
                
                if(p1==-1 || pp1<p1)
                p1=pp1;
                if(p2==-1 || pp2>p2){
                    p2=pp2;
                }
                pp2++;
            }
            idx++;
        }

        while(pp1<mid){
            int a=arr[pp1];
            copy[idx]=a;
                pp1++;
                idx++;
                // if(p1!=-1){
                //     p2=hi;
                // }
        }
        while(pp2<=hi){
            int b=arr[pp2];
             copy[idx]=b;
                idx++;
                pp2++;
        }
    }
}
