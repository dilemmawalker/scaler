    public class Solution { //b closest points to origin
        public int[][] solve(int[][] arr, int b) {
            int n=arr.length;
            int aa=0,bb=0;
            long sum=0l;
            long[]ar=new long[n];
            
            for(int i=0;i<n;i++){
                int a=arr[i][0];
                int c=arr[i][1];

                long val=0l;
                val=(a*1l)*a + (c*1l)*c;
                ar[i]=val;
            }

            sort(ar,arr,0,n-1);
            int[][]ans=new int[b][2];

            for(int i=0;i<b;i++){
                ans[i][0]=arr[i][0];
                ans[i][1]=arr[i][1];
                
            }
            // for(int i=0;i<n;i++){
            //     System.out.print(ar[i]+" ");
            // }
            
            return ans;
        }

        public void sort(long[]ar,int[][]arr,int lo,int hi){
            int n=arr.length;
            if(lo==hi)
            return;

            int mid=(lo+hi)/2;
            sort(ar,arr,lo,mid);
            sort(ar,arr,mid+1,hi);

            merge(ar,arr,lo,mid,hi);
        }

        public void merge(long[]ar,int[][]arr,int lo,int mid,int hi){  //merge function
            int n=ar.length;
            mid++;                       //important!!!!
            int mi=mid;
            int l=lo,m=mid,h=hi;
            long[]temp=new long[hi-lo+1];
            int[][]tempp=new int[hi-lo+1][2];
            int idx=0;
            while(lo<mi && mid<=hi){
                long a=ar[lo];
                long b=ar[mid];

                if(a<b){
                    temp[idx]=a;
                    tempp[idx][0]=arr[lo][0];
                    tempp[idx][1]=arr[lo][1];
                    idx++;
                    lo++;
                }
                else{
                    temp[idx]=b;
                    tempp[idx][0]=arr[mid][0];
                    tempp[idx][1]=arr[mid][1];
                    idx++;
                    mid++;
                }
            }
            while(lo<mi){
                long a=ar[lo];

                    temp[idx]=a;
                    tempp[idx][0]=arr[lo][0];
                    tempp[idx][1]=arr[lo][1];
                    idx++;
                    lo++;
                
            }
            while(mid<=hi){
                    long b=ar[mid];

                    temp[idx]=b;
                    tempp[idx][0]=arr[mid][0];
                    tempp[idx][1]=arr[mid][1];
                    idx++;
                    mid++;            
            }
            idx=0;
            for(int i=l;i<=h;i++){  //important!!!!   go till h position i.e. i<=h & not i<h   (v.v.imp)
                ar[i]=temp[idx];
                arr[i][0]=tempp[idx][0];
                arr[i][1]=tempp[idx][1];
                idx++;
            }
        }
    }


