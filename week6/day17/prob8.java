public class Solution { 
    public int solve(int aa, int[] b, int[][] c) {
        int n=c.length;
        int[]arr=new int[50];//pair real
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<b.length;i++){
            map.put(b[i],i);
        }
        for(int i=0;i<n;i++){
            int a=c[i][0];
            int bb=c[i][1];
            arr[a]=bb;
            arr[bb]=a;
        }
       
        sol(arr,b,0,0,map);
        return min;
    }
    public int min=Integer.MAX_VALUE;
    public void sol(int[]arr,int[]b,int s,int idx, HashMap<Integer,Integer>map){
        int n=b.length;
        if(idx>=n){
        boolean val=check(b,arr);
        if(val)
        min=Math.min(min,s);
        return ;
        }
       
        for(int i=idx;i<n;i+=2){
            int a=b[i]; 
            int c=b[i+1]; 
            if(arr[a]!=c && arr[c]!=a){
                int d=arr[a];
                int e=arr[c];
                int idx1=map.get(d);
                int idx2=map.get(e);
                map.put(a,idx2);
                map.put(e,i);
                b[i]=e;
                b[idx2]=a;
                sol(arr,b,s+1,idx+2,map);
                b[i]=a;
                b[idx2]=e;
                map.put(a,i);
                map.put(e,idx2);

                map.put(c,idx1);
                map.put(d,i+1);
                b[i+1]=d;
                b[idx1]=c;
                sol(arr,b,s+1,idx+2,map);
                b[i+1]=c;
                b[idx1]=d;
                map.put(d,idx1);
                map.put(c,i+1);
            }
            // else
            // sol(arr,b,s,idx+2,map);
        }
        boolean val=check(b,arr);
        if(val)
        min=Math.min(min,s);
        return;
    }
    public boolean check(int[]b,int[]arr){
        int n=b.length;

        for(int i=1;i<n;i+=2){
            int a=b[i];
            int c=b[i-1];

            if(arr[a]!=c)
            return false;
        }
        return true;
    }
}
