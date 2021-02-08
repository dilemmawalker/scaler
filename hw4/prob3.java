public class Solution {
    public int firstMissingPositive(int[] arr) {
     int n=arr.length;
     for(int i=0;i<n;i++){
         int a=arr[i];
         while(a>0 && (a-1)!=i && (a-1)<n){

             swap(arr,i,a);
             int b=arr[i];
             if(a==b)
             break;
             a=b;
         }
     }
     for(int i=0;i<n;i++){
         if(arr[i]!=(i+1))
         return (i+1);
     }
     return n+1;
 }
     public void swap(int[]arr,int i,int a){
         int n=arr.length;
        //  if((a-1)<n)
         int temp=arr[a-1];
         arr[a-1]=a;
         arr[i]=temp;
     }
 }
 