public class Solution { //max & min magic
    public int[] solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);

        long min=0l,max=0l;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=0;i<n;i+=2){
            int a=arr[i];
            int b=arr[i+1];

            min=((min+b-a)*1l+mod)%mod;
        }
        for(int i=0;i<n/2;i++){
            int a=arr[i];
            int c=arr[n/2+i];

            max=((max+c-a)*1l+mod)%mod;
        }

        int []b={(int)max,(int)min};
        return b;
    }

}
