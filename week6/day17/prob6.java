public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int vis=0;
        ArrayList<Integer>ar=new ArrayList<>();

         int ans=0;
         if(n==1){
             int a=(int)Math.sqrt(n);
             if((a*a)==arr[0])
             return 1;
             else
             return 0;
         }
        
        sol(arr,0,vis,ans,new ArrayList<Integer>(),new ArrayList<Integer>());
        // System.out.println(ar);
        return ans;
    }
    public int anss=0;
    public int sol(int[]arr,int p,int vis,int ans,ArrayList<Integer>ar,ArrayList<Integer>index){
        if(p==arr.length){
            //check
           ans++;
           anss++;
           return 1;
        }

        int n=arr.length;
        int a=0;
        for(int i=0;i<n;i++){
            if((vis & (1<<i))==0 ){
                if(i==0 || (arr[i-1]!=arr[i]) || (vis & (1<<(i-1)))!=0 ){
                if(ar.size()!=0){
                int pr=ar.get(ar.size()-1);
                int c=arr[i]; 
                int sum=pr+c;

                int val=(int)Math.sqrt(sum);
                if((val*val)!=sum)
                continue;
                }

                vis|=(1<<i);
                ar.add(arr[i]);
                index.add(i);
                a+=sol(arr,p+1,vis,ans,ar,index);
                index.remove(index.size()-1);
                ar.remove(ar.size()-1);
                vis &=(~(1<<i));
                }
                }
            }
            return a;
        }
    }

//     public boolean check(ArrayList<Integer>ar){
//         int n=ar.size();
//         for(int i=1;i<n;i++){
//             int p=ar.get(i-1);
//             int c=ar.get(i);
//             int sum=p+c;

//             int val=(int)Math.sqrt(sum);
//             if(val*val!=sum)
//             return false;
//         }
//         return true;
//     }
// }
