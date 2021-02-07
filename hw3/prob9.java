public int solve(int[] arr, int k) {
    int n=arr.length;
    int p1=-1;
    int p2=n-1-(k-1);
    int sum=Integer.MIN_VALUE;

    int[]arr1=new int[n];
    int[]arr2=new int[n];
    int c=0;
    for(int i=0;i<n;i++){
        c+=arr[i];
        arr1[i]=c;
    }
    c=0;
    for(int i=n-1;i>=0;i--){
        c+=arr[i];
        arr2[i]=c;
    }
    while(p1<k){
        int b=0;
        if(p2<n){
            b=arr2[p2];
        }

        int a=0;
        if(p1>=0 && p1<k){
            a=arr1[p1];
        }
        sum=Math.max(sum,(a + b));
        p1++;
        p2++;
    }
    return sum;
}