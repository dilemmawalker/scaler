public class Solution { //combination sum
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>ar=new ArrayList<>();

        sol(arr,0,0,sum,ar,ans,new boolean[arr.size()]);
        return ans;
    }
    public void sol(ArrayList<Integer>arr,int s,int idx,int sum,ArrayList<Integer>ar,
    ArrayList<ArrayList<Integer>>ans,boolean[]vis){
        int n=arr.size();
        if(s>sum)
        return ;
        if(idx==n){
            //check;
            if(s==sum){
                ArrayList<Integer>temp=new ArrayList<>();
                temp.addAll(ar);
                ans.add(temp);
            }
            return;
        }

        if(idx==0 || arr.get(idx-1)!=arr.get(idx) || vis[idx-1]){
            vis[idx]=true;
            ar.add(arr.get(idx));
            s+=arr.get(idx);
            sol(arr,s,idx+1,sum,ar,ans,vis);
            s-=arr.get(idx);
            ar.remove(ar.size()-1);
            vis[idx]=false;
        }

        sol(arr,s,idx+1,sum,ar,ans,vis);
        
    }
}


