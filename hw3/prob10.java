    public class Solution {
        public int solve(int[] A, int[] B, int[] C, int[] D) {
            int n=A.length;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            // int ans=0;
            int[]ans1=new int[16];          //min
            int []ans2=new int[16];         //max
            for(int i=0;i<16;i++){
                ans1[i]=Integer.MAX_VALUE;
                ans2[i]=Integer.MIN_VALUE;
            }

            for(int k=0;k<n;k++){
                int a=A[k];
                int b=B[k];
                int c=C[k];
                int d=D[k];
                int l=k+1;

                int[]arr={a,b,c,d,l};
                int idx=0;
                for(int i=5;i>=0;i--){  
                    int sum=0;
                    int j=0;
                    for(j=0;j<i;j++){
                        sum+=arr[j];
                    }
                    if(i==5){
                        ans1[idx]=Math.min(ans1[idx],sum);
                        ans2[idx]=Math.max(ans2[idx],sum);
                        idx++;
                    }
                    int nnn=5;
                    for( j=i;j<nnn;nnn--){  
                        int cc=sum;
                        for(int m=j;m<nnn;m++){
                            cc-=arr[m];
                        }
                        for(int m=nnn;m<5;m++){
                            cc+=arr[m];
                        }

                        ans1[idx]=Math.min(ans1[idx],cc);
                        ans2[idx]=Math.max(ans2[idx],cc);
                        idx++;
                    }
                }
            }

            int ans=0;
            for(int i=0;i<16;i++){
                ans=Math.max(ans,ans2[i]-ans1[i]);
            }
            return ans;
        }
        
    }
