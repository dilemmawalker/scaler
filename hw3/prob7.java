public int maxArr(int[] arr) {
        int n=arr.length;
        int ans=0;
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MAX_VALUE;
        int n1=Integer.MIN_VALUE;
        int n2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                m1=Math.max(m1,(arr[i]+i));
                m2=Math.min(m2,(arr[i]+i));

                n1=Math.max(n1,(arr[i]-i));
                n2=Math.min(n2,(arr[i]-i));
        }
        ans=m1-m2;
        ans=Math.max(ans,(n1-n2));

        return ans;
}       