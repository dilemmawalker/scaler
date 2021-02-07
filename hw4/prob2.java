public int[] repeatedNumber(final int[] arr) {
    int n=arr.length;
    long ass=0l;
    long dass=0l;
    for(int i=0;i<n;i++){
        int a=arr[i];
        ass+=a; 
        dass+=(a*a);
    }
    long as=0l,das=0l,a=0l,b=0l,xx=0l;
     as=(n*(n+1))/2;
     das=(n*(n+1)*((2*n)+1))/6;

     a=as-ass;
     b=das-dass;

    int x=((b-(a*a))/a)/2;
    int y=x+a;
    y=(b+(a*a))/(2*a);

    int[]ans={x,y};
    return ans;
}