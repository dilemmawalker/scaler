public class Solution {                 //Bus and Passenger
    public int[] solve(int[] arr, String str) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=arr[i];
            map.put(a,i);
        }
        Arrays.sort(arr);

        int[]ans=new int[2*n];
        int[]fill=new int[n];
        for(int i=0;i<n;i++){
            fill[i]=-1;
        }

        int size=str.length();
        int idx=0;
        for(int i=0;i<size;i++){
            char ch=str.charAt(i);
            int no=ch-'0';
            if(no==0){
                ans[i]=idx;
                idx++;      //for 0 placed
            }
            else{
                idx--;
                if(fill[idx]==-1){
                    ans[i]=idx;
                    
                    if(idx-1>=0){
                    if(fill[idx-1]!=-1)
                    fill[idx]=fill[idx-1];
                    else
                    fill[idx]=idx-1;
                    }
                }
                else{   
                    int val=fill[idx];
                    ans[i]=val;

                     if(val-1>=0 && fill[val-1]!=-1){
                        fill[val]=fill[val-1];
                        fill[idx]=fill[val-1];
                     }
                    else{
                        fill[val]=val-1;
                        fill[idx]=val-1;
                    }
                    
                }
                idx++;
            }
        }

        for(int i=0;i<ans.length;i++){
            int val=ans[i];
            int no=arr[val];
            int v=map.get(no);
            ans[i]=v+1;
        }
        return ans;
    }
}
