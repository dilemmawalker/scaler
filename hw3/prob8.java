public int[] solve(int a, int[][] arr) {
    int[]ans=new int[a];
    int q=arr.length;
    for(int i=0;i<q;i++){
        int e1=arr[i][0];
        int e2=arr[i][1];
        int amt=arr[i][2];

        ans[e1-1]+=amt;
        if(e2<a)
        ans[e2]-=amt;
    }

    int c=0;
    for(int i=0;i<a;i++){
        c+=ans[i];
        ans[i]=c;
    }
    return ans;
}