public class Solution {
    public int solve(int[] A, int[] B, int[] C, int[] D) {
        int n=A.length;
        int[]arr1=new int[16];
        int[]arr2=new int[16];
        for(int  i=0;i<16;i++){
            arr1[i]=Integer.MIN_VALUE;
            arr2[i]=Integer.MAX_VALUE;
        }

        for(int i=0;i<n;i++){
            int a=A[i];
            int b=B[i];
            int c=C[i];
            int d=D[i];

            arr1[0]=Math.max(arr1[0],(a+b+c+d+i));
            arr1[1]=Math.max(arr1[1],(a+b+c+d-i));
            arr1[2]=Math.max(arr1[2],(a+b+c-d+i));
            arr1[3]=Math.max(arr1[3],(a+b+c-d-i));
            arr1[4]=Math.max(arr1[4],(a+b-c+d+i));
            arr1[5]=Math.max(arr1[5],(a+b-c-d+i));
            arr1[6]=Math.max(arr1[6],(a+b-c-d-i));
            arr1[7]=Math.max(arr1[7],(a-b+c+d+i));
            arr1[8]=Math.max(arr1[8],(a-b-c+d+i));
            arr1[9]=Math.max(arr1[9],(a-b-c-d+i));
            arr1[10]=Math.max(arr1[10],(a-b-c-d-i));
            arr1[11]=Math.max(arr1[11],(-a+b+c+d+i));
            arr1[12]=Math.max(arr1[12],(-a-b+c+d+i));
            arr1[13]=Math.max(arr1[13],(-a-b-c+d+i));
            arr1[14]=Math.max(arr1[14],(-a-b-c-d+i));
            arr1[15]=Math.max(arr1[15],(-a-b-c-d-i));
            arr1[16]=Math.max(arr1[16],(a+b-c+d-i));
            arr1[17]=Math.max(arr1[17],(a-b-c+d-i));
            arr1[18]=Math.max(arr1[18],(a-b+c+d-i));
            arr1[19]=Math.max(arr1[19],(-a+b-c+d-i));
            arr1[20]=Math.max(arr1[20],(-a+b+c-d+i));
            arr1[21]=Math.max(arr1[21],(-a+b-c+d+i));
            


            arr2[0]=Math.min(arr2[0],(a+b+c+d+i));
            arr2[1]=Math.min(arr2[1],(a+b+c+d-i));
            arr2[2]=Math.min(arr2[2],(a+b+c-d+i));
            arr2[3]=Math.min(arr2[3],(a+b+c-d-i));
            arr2[4]=Math.min(arr2[4],(a+b-c+d+i));
            arr2[5]=Math.min(arr2[5],(a+b-c-d+i));
            arr2[6]=Math.min(arr2[6],(a+b-c-d-i));
            arr2[7]=Math.min(arr2[7],(a-b+c+d+i));
            arr2[8]=Math.min(arr2[8],(a-b-c+d+i));
            arr2[9]=Math.min(arr2[9],(a-b-c-d+i));
            arr2[10]=Math.min(arr2[10],(a-b-c-d-i));
            arr2[11]=Math.min(arr2[11],(-a+b+c+d+i));
            arr2[12]=Math.min(arr2[12],(-a-b+c+d+i));
            arr2[13]=Math.min(arr2[13],(-a-b-c+d+i));
            arr2[14]=Math.min(arr2[14],(-a-b-c-d+i));
            arr2[15]=Math.min(arr2[15],(-a-b-c-d-i));
            arr2[16]=Math.min(arr2[16],(a+b-c+d-i));
            arr2[17]=Math.min(arr2[17],(a-b-c+d-i));
            arr2[18]=Math.min(arr2[18],(a-b+c+d-i));
            arr2[19]=Math.min(arr2[19],(-a+b-c+d-i));
            arr2[20]=Math.min(arr2[20],(-a+b+c-d+i));
            arr2[21]=Math.min(arr2[21],(-a+b-c+d+i));
            
        }
        int ans=0;
        for(int i=0;i<16;i++){
            int a=arr1[i];
            int b=arr2[i];

            ans=Math.max(ans,a-b);
        }
        return ans;
    }
}
