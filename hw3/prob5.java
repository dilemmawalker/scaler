import java.util.Scanner;
public class prob5{
    public static void main(String[]args){
        int[]arr={9, 9, 9};
        int[]a=plusOne(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] plusOne(int[] arr) {
        int n=arr.length;
        int c=0;
        int i=n-1;
        do{
            int a=arr[i];
            a+=1;
            c=a-9;
            arr[i]=a%10;
            i--;
        }while(c>0 && i>=0);
        boolean flag=false;
        if(c>0)
        flag=true;

        c=0;
         i=0;
         if(!flag){
        for( i=0;i<n;i++){
            if(arr[i]==0)
            c++;
            else 
            break;
        }
    }
        n=n-c ;
        if(flag)
        n++;

        int[]ans=new int[n];

        int k=0;
        if(flag){
            ans[0]=1;
            k=1;
        }

        for( ;i<arr.length;i++){
            ans[k++]=arr[i];
        }
        return ans;
    }
}