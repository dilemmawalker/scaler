boolean print(int i,int n,int ans[],int k,int sum){

    if(i==n){
        if(sum>k)
        return true;
        else
        return false;
    }

    boolean res=false;
  
        int a=ans[i];
        res=res||print(i+1,n,ans,k,sum);
        res=res||print(i+1,n,ans,k,sum+a);
//
    return res;
}