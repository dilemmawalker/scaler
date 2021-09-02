public class Solution {                         //Painter's Partition Problem
    public int paint(int no, int cost, int[] arr) {
        int n=arr.length;
        long min=0l;
        long max=0l;
        for(int i=0;i<n;i++){
            int a=arr[i];
            min=Math.max(min,a);
            max+=a;
        }
        min=min*1l;
        max=max*1l;
        return (int)((bs(arr,min,max,no,cost)*cost+10000003)% 10000003);
    }
    public long bs(int[]arr,long lo,long hi,int no,int b){      // do ans % 10000003;
        if(lo==hi){
          return (lo);
        }

        long mid=0l;
        mid=(hi+lo)/2;
        int val=count(arr,mid,b);//no of painters required
        // System.out.println(val);
        if(val<=no){
            return (bs(arr,lo,mid,no,b));
        }
        else{
            return (bs(arr,mid+1,hi,no,b));
        }
    }
    public int count(int[]arr,long val,int b){
        int p=1;
        int n=arr.length;
        long sum=0l;
        for(int i=0;i<n;i++){
            int a=arr[i];
            long v=a*1l;
            if((sum+v)>val){
                sum=v;
                p++;
            }
            else{
                sum+=v;
            }
        }
        return p;
    }
}
