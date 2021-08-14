public class Solution { //tle
    public int solve(int aa, int[] b, int[][] c) {
        int n=c.length;
        int[]arr=new int[50];//pair real
        for(int i=0;i<n;i++){
            int a=c[i][0];
            int bb=c[i][1];
            arr[a]=bb;
            arr[bb]=a;
        }
        HashSet<Integer>[]map=new HashSet[41];
        for(int i=0;i<41;i++){
            map[i]=new HashSet<Integer>();
        }
        sol(arr,b,0,map,0);
        return min;
    }
    public int min=Integer.MAX_VALUE;
    public void sol(int[]arr,int[]b,int s, HashSet<Integer>[]map,int idx){
        int n=b.length;
        boolean val=check(b,arr);
        if(val)
        min=Math.min(min,s);
        if(idx==n)
        return;

        for(int i=idx;i<n;i++){
            for(int j=idx+1;j<n;j++){
                int a=b[i];
                int c=b[j];

                if(!(map[a].contains(c)) && !(map[c].contains(a))){
                    b[i]=c;
                    b[j]=a;
                    map[a].add(c);
                    sol(arr,b,s+1,map,0);
                    map[a].remove(c);
                }
            }
            sol(arr,b,s,map,idx+1);
        }
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
