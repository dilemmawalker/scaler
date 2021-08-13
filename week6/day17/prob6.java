public class Solution {
    public int solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int vis=0;
        ArrayList<Integer>ar=new ArrayList<>();

        int ans=0;
        sol(arr,0,vis,ans,new ArrayList<Integer>(),new ArrayList<Integer>());
        return ans;
    }
    public void sol(int[]arr,int p,int vis,int ans,ArrayList<Integer>ar,ArrayList<Integer>index){
        if(p==arr.length){
            //check
           ans++;
        }

        int n=arr.length;
        for(int i=0;i<n;i++){
            if((vis & (1<<i))==0 ){
                if(ar.size()==0 ||(ar.get(ar.size()-1)!=arr[i]) || (vis & (1<<(index.get(index.size()-1))))!=0 ){
                if(ar.size()!=0){
                int p=ar.get(ar.size()-1);
                int c=ar.get(i);
                int sum=p+c;

                int val=(int)Math.sqrt(sum);
                if((val*va)l!=sum)
                continue;
                }

                vis|=(1<<i);
                ar.add(arr[i]);
                index.add(i);
                sol(arr,p+1,vis,ans,ar,index);
                index.remove(index.size()-1);
                ar.remove(ar.size()-1);
                vis &=(~(1<<i));
                }
                }
            }
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
