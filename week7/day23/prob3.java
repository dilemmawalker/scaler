public class Solution {                 //Sort by color
    public int[] sortColors(int[] arr) {
        int n=arr.length;
        int a=0,b=0,c=0;
        for(int i=0;i<n;i++){
            int d=arr[i];
            if(d==0)
            a++;
            if(d==1)
            b++;
            if(d==2)
            c++;
        }
        for(int i=0;i<a;i++){
            arr[i]=0;
        }
        for(int i=a;i<a+b;i++){
            arr[i]=1;
        }
        for(int i=a+b;i<a+b+c;i++){
            arr[i]=2;
        }
        return arr;
    }
}
