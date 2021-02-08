public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=arr[i];
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        ArrayList<Integer>mi=new ArrayList<>();
        ArrayList<Integer>ma=new ArrayList<>();

        int p1=0;
        int p2=0;

        if(min==max)
        return 1;

        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a==min)
            mi.add(i);
            if(a==max){
                ma.add(i);
            }
        }

        int ans=mi.get(p1)-ma.get(p1);
        if(ans<0)
        ans=-ans;

        while(p1==n || p2==n){
            int a=mi.get(p1);
            int b=mi.get(p2);

            int c=(a-b)>=0?a-b:b-a;
            ans=Math.min(ans,c);


            int a1=Integer.MAX_VALUE;
            int a2=Integer.MAX_VALUE;

            if(p1+1<n){
            a1=  mi.get(p1+1)-b;
            if(a1<0)
            a1=-a1;
            }
           
            if(p2+1<n){
            a2=  ma.get(p2+1)-a;
            if(a2<0)
            a2=-a2;
            }
            
            if(a1<a2){
                p1++;
            }
            else if(a2<a1){
                p2++;
            }
            else{
                p1++;
                p2++;
            }
        }

        return ans+1;
    }
}
