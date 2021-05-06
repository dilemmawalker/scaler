public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> arr) {
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Stack<Integer>>map2=new HashMap<>();

        int val=-1;
        int n=arr.size();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=arr.get(i).get(0);
            int b=arr.get(i).get(1);

            if(a==1){               //push

                int freq=0;
                if(map1.containsKey(b))
                 freq=map1.get(b);
                map1.put(b,++freq);

                Stack<Integer>st=new Stack<>();
                if(map2.containsKey(freq))
                st=map2.get(freq);
                // else
                // st=new Stack<>();

                st.push(b);
                map2.put(freq,st);

                val=Math.max(val,freq);

                ans.add(-1);
            }
            else{                   //remove
                Stack<Integer>st=map2.get(val);
                int ele=st.pop();

                if(st.size()==0){
                    map2.remove(val);
                    val--;
                }
                else{
                    map2.put(val,st);
                }
                int freq=map1.get(ele);
                freq--;
                if(freq!=0){
                    map1.put(ele,freq);
                }
                else
                map1.remove(ele);

                ans.add(ele);
            }
            
        }
        return ans;
    }
}
