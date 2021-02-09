public class Solution {
    public int[][] diagonal(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;

        int d=(n+m)-1;
        int[][]ans=new int[d][];

        int idx=0;
        for(int i=0;i<m;i++){
            int a=arr[0][i];
            int r=0;int c=i;
            ArrayList<Integer>ar=new ArrayList<>();
            while(r<n && c>=0){
                int b=arr[r][c];
                r++;
                c--;
                ar.add(b);
            }
            int size=ar.size();
            ans[idx++]=new int[size];
            for(int j=0;j<size;j++){
                int b=ar.get(j);
                ans[i][j]=b;
            }
        }

        for(int i=1;i<n;i++){

            int r=i;int c=m-1;
            ArrayList<Integer>ar=new ArrayList<>();
            while(r<n && c>=0){
                int b=arr[r][c];
                r++;
                c--;
                ar.add(b);
            }
            int size=ar.size();
            ans[idx++]=new int[size];
            for(int j=0;j<size;j++){
                int b=ar.get(j);
                ans[idx-1][j]=b;
            }
        }
        return ans;
    }

}
