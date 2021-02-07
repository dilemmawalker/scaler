public int majorityElement(final int[] arr) {
    int n=arr.length;
    int ele=-1;
    int c=-1;
    int freq=0;
    for(int i=0;i<n;i++){
        int a=arr[i];
        if(c==-1){
            c=a;
            freq=1;
        }
        else if(c!=a){
           freq--;
           if(freq==0){
               c=-1;
           }
        }
        else if(c==a){
            freq++;
        }
    }
            return c;
}