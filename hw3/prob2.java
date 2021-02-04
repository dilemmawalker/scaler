public int maxArr(int[] arr) {
    int n=arr.length;
    int c=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int a=arr[i]-arr[j];
            int b=i-j;
            int sum=a>=0?a:-a;
            sum+=b>=0?b:-b;
            c=Math.max(c,sum);
        }
    }
    return c;
}