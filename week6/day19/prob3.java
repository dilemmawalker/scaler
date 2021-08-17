public class Solution {
    public int[][] combinationSum(int[] aa, int B) {
        
        Arrays.sort(aa);
        HashSet<Integer>map=new HashSet<>();
        ArrayList<Integer>bb=new ArrayList<>();
        for(int i=0;i<aa.length;i++){
            //remove duplicates
            if(!map.contains(aa[i])){
                map.add(aa[i]);
                bb.add(aa[i]);
            }
        }
        int[]arr=new int[bb.size()];
        for(int i=0;i<bb.size();i++){
            // System.out.print(bb.get(i)+" ");
            arr[i]=bb.get(i);
        }

           int n=arr.length;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>ar=new ArrayList<>();

        sol(arr,B,0,0,ans,ar);

        if(ans.size()==0)
        return new int[0][0];

        int l=ans.size();
        int[][]anss=new int[l][];//do l
        for(int i=0;i<l;i++){
            
            int m=ans.get(i).size();
            anss[i]=new int[m];
            for(int j=0;j<m;j++){
                anss[i][j]=ans.get(i).get(j);
                // System.out.print(ans.get(i).get(j));
            }
        }
        return anss;
    }
    
    public void sol(int[]arr,int b,int idx,int sum,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ar){
        int n=arr.length;
        if(sum==b){
            ArrayList<Integer>temp=new ArrayList<>();
            temp.addAll(ar);
            ans.add(temp);
            return;
        }
        if(idx==n || sum>b){
            return ;
        }

        ar.add(arr[idx]);
        sol(arr,b,idx,sum+arr[idx],ans,ar);
        ar.remove(ar.size()-1);

        sol(arr,b,idx+1,sum,ans,ar);
        
    }
}
