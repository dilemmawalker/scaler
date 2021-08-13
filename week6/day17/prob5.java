public class Solution {
    public String[] letterCombinations(String str) {
        ArrayList<Character>[]arr=new ArrayList[10];
        int n=10;
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<Character>();
        }
        arr[0].add('0');
        arr[1].add('1');
        arr[2].add('a');
        arr[2].add('b');
        arr[2].add('c');
        arr[3].add('d');
        arr[3].add('e');
        arr[3].add('f');
        arr[4].add('g');
        arr[4].add('h');
        arr[4].add('i');
        arr[5].add('j');
        arr[5].add('k');
        arr[5].add('l');
        arr[6].add('m');arr[6].add('n');arr[6].add('o');
        arr[7].add('p'); arr[7].add('q'); arr[7].add('r'); arr[7].add('s');
        arr[8].add('t');arr[8].add('u');arr[8].add('v');
        arr[9].add('w');arr[9].add('x');arr[9].add('y');arr[9].add('z');

        ArrayList<String>ans=new ArrayList<>();
        sol(str,0,arr,ans,"");

        n=ans.size();
        String []fans=new String[n];
        for(int i=0;i<n;i++){
            String s=ans.get(i);
            fans[i]=s;
        }
        return fans;
    }
    public void sol(String str,int idx,ArrayList<Character>[]arr,ArrayList<String>ans,String temp){

        if(idx==str.length()){
            ans.add(temp);
            return ;
        }

        char ch=str.charAt(idx);
        int n=arr[ch-'0'].size();

        for(int i=0;i<n;i++){
            char c=arr[ch-'0'].get(i);
                sol(str,idx+1,arr,ans,temp+c);
        }
    }
}
