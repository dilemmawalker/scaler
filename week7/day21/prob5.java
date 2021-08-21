public int maximumNumber(int[][]arr,int a,int b,int k){
    int n=arr.length;
    int m=arr[0].length;

    int[][]ar=new int[n][m];
    int max=Integer.MIN_VALUE;
    ArrayList<Integer>ar;
    for(int i=0;i<n;i++){
        ar=new ArrayList<>();
        for(int j=0;j<m;j++){
            if(arr[i][j]==2){
                arr[i][j]=0;
                ar.add(j);
            }
            max=Math.max(max,sol(arr,k));
            
        }
        for(int j=0;j<ar.size();j++){
                int aa=ar.get(j);
                arr[i][j]=2;
        }
    }
    return max;
}

public int sol(int[][]arr,int k){
    int n=arr.length;
    int m=arr[0].length;
    int val=0;
    int[][]ans=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE;

            int v=0;
            if(i-1>=0){
                a=ans[i-1][j];
                if(arr[i-1][j]==1)
                a++;
                else if(arr[i-1][j]==2)
                a--;
            }
            if(i-1>=0 && j+1<m){
            b=ans[i-1][j+1];
            if(arr[i-1][j]+1==1)
                b++;
                else if(arr[i-1][j+1]==2)
                b--;
            }
            if(i-1>=0 && j-1>=0){
            c=ans[i-1][j-1];
            if(arr[i-1][j-1]==1)
                c++;
                else if(arr[i-1][j-1]==2)
                c--;
            }

            val=Math.max(a,Math.max(b,c));
            ans[i][j]=val;
        }
    }
    int sum=0;
    for(int i=0;i<m;i++){
        sum=Math.max(ans[n-1][i]);
    }
    return sum;
}