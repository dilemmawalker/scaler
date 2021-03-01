public class Solution {
    public int[] solve(int[] ar) {
        int n=ar.length;
        Arrays.sort(ar);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(ar[i]);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(arr.size()>0){

            int ele=arr.get(arr.size()-1);
                int s=ele;
                int idx=binarysearch(s,arr,0,arr.size()-1);
                arr.remove(idx);
                for(int i=0;i<ans.size();i++){
                    int e=ans.get(i);
                    int sum=ele+e;
                    int max=Math.max(ele,e);
                    int min=sum-max;

                    s=gcd(max,min);
                    idx=binarysearch(s,arr,0,arr.size()-1);
                    arr.remove(idx);
                    idx=binarysearch(s,arr,0,arr.size()-1);
                    arr.remove(idx);
                }
                ans.add(ele);
        }
        n=ans.size();
        int[]anss=new int[n];
        for(int i=0;i<n;i++){
            anss[i]=ans.get(i);
        }
        return anss;
    }
    public int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
    public int binarysearch(int ele,ArrayList<Integer>arr,int start,int end){
        int n=arr.size();

        int mid=(start+end)/2;
        int ans=mid;
        
        if(arr.get(mid)==ele){
            return mid;
        }
        if(start>end)
        return -1;

        int a=binarysearch(ele,arr,mid+1,end);
        int b=binarysearch(ele,arr,start,mid-1);
        return Math.max(a,b);
    }
}
