public class Solution {                 //still giving error
	// DO NOT MODIFY BOTH THE LISTS     //Median of Array
	public double findMedianSortedArrays(final List<Integer> arr1, final List<Integer> arr2) {
        int n=arr1.size();
        int m=arr2.size();

        if(n==0 || m==0){
            if(n==0){
                if(m==0)
                return -1;
                return m%2!=0?arr2.get(m/2):((arr2.get(m/2-1)+arr2.get(m/2))*1.0)/2;
            }
            else{
                return n%2!=0?arr1.get(n/2):((arr1.get(n/2-1)+arr1.get(n/2))*1.0)/2;
            }
        }

        int lo=Math.min(arr1.get(0),arr2.get(0));
        int hi=Math.max(arr1.get(n-1),arr2.get(m-1));
        bs(arr1,arr2,lo,hi,(n+m)%2!=0?(n+m)/2:(n+m)/2-1);
        int val=nextgreater(arr1,ans);
        val=Math.min(val,nextgreater(arr2,ans));

        if((n+m)%2!=0)
        return val;
        else{
            int v=nextgreater(arr1,val+1);
            v=Math.min(v,nextgreater(arr2,val+1));
            return ((val+v)*1.0)/2;
        }
	}
    public int ans=Integer.MAX_VALUE;
    public void bs(List<Integer>arr1,List<Integer>arr2,int lo,int hi,int no){
        int n=arr1.size();
        int m=arr2.size();

        if(lo>hi)
        return;

        int mid=(lo+hi)/2;
        int val=smaller(arr1,mid);
        val+=smaller(arr2,mid);     //this gives first occurrence.

        //find last occurrence of mid, & then if true, mark ans & return;
        int lastoccr=last(arr1,mid);
        lastoccr+=last(arr2,mid);
        if(no>val && no<lastoccr){
            ans=mid;
            return;
        }
        else if(val<no){
            bs(arr1,arr2,mid+1,hi,no);
        }
        else{
            ans=mid;
            bs(arr1,arr2,lo,mid-1,no);
        }
    }
    public int smaller(List<Integer>arr,int val){
        //returns no. of elements < val
        int n=arr.size();

        int ans=-1;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr.get(mid)<val){       //<= can be used if current element is included.(with repetition)
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans+1;//+1 signifies current element in included in total count.
    }
    public int nextgreater(List<Integer>arr,int val){
    //returns same or next greatest element present in array.
        int ans=Integer.MAX_VALUE;
        int n=arr.size();
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr.get(mid)<val)
            lo=mid+1;
            else{
                ans=mid;
                hi=mid-1;
            }
        }
        if(ans=Integer.MAX_VALUE)
        return ans;
        return arr.get(ans);
    }
    public int last(List<Integer>arr,int val){
        //returns no. of elements <= val
        int n=arr.size();

        int ans=-1;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr.get(mid)<=val){       //<= can be used if current element is included.(with repetition)
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans+1;//+1 signifies current element in included in total count.
    }
}
