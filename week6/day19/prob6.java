public class Solution {
	public ArrayList<ArrayList<String>> partition(String str) {
        int n=str.length();
        int ans="";
        ArrayList<ArrayList<String>>ans=new ArrayList<>();
        ArrayList<String>ar=new ArrayList<>();
        sol(str,0,n,"",ans,ar,0);
        return ans;
	}
    public void sol(String str,int idx,int n,String s,ArrayList<ArrayList<String>>ans,ArrayList<String>ar,int val){
            if(idx==n){
                if(val==0){
                    ArrayList<String>temp=new ArrayList<>();
                    temp.addAll(ar);
                    ans.add(temp);
                }
                return ;
            }
            String t=s+str.charAt(idx);
            boolean a=check(t);
            if(a){
            ar.add(t);
            sol(str,idx+1,n,"",ans,ar,0);
            ar.remove(ar.size()-1);
            }

            sol(str,idx+1,n,s+str.charAt(idx),ans,ar,1);
    }
    public boolean check(String str){
        int n=str.length();
        int i=0;int j=n-1;
        while(i<j){
            if(str.charAt(i!=str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
