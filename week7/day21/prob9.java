public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] arr) {          //Largest Number
        int n=arr.length;
        sort(arr,0,n-1);
    
            int i=0;

        StringBuilder st=new StringBuilder();
        boolean flag=false;
        for( i=n-1;i>=0;i--){
            int a=arr[i];
            st.append(a);
        }
        for( i=0;i<n;i++){
            char a=st.charAt(i);
            if(a!='0' || i==n-1)
            break;
        }
        return st.substring(i).toString();
    }
    public void sort(int[]arr,int lo,int hi){
        if(lo==hi)
        return ;

        int mid=(lo+hi)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);

        merge(arr,lo,mid+1,hi);
    }
    public void merge(int[]arr,int lo,int mid,int hi){
        int n=hi-lo+1;
        int[]ar=new int[n];
        int p=0;

        int p1=lo,p2=mid;
        while(p1<mid && p2<=hi){
            int a=arr[p1];
            int b=arr[p2];

            String aa=a+"";
            aa+=b;
            String bb=b+"";
            bb+=a;

            long no1=0l,no2=0l;
             no1=str(aa);
             no2=str(bb);
            if(no1<no2){
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
    public long str(String n){
        long no=0l;
        int size=n.length();
        for(int i=0;i<size;i++){
            char ch=n.charAt(i);
            no*=10;
            no+=ch-'0';
        }
        return no;
    }
}
