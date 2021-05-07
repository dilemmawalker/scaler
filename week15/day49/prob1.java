public class Solution {
    public String solve(String str, int b) {
        int n=str.length();
        Stack<Character>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        Long sum=0l;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int val=ch-'a';
            if(val>=0 && val<=25){
                sum++;
                if(sum>b)
                break;
                st1.push(ch);
                int aa = Math.toIntExact(sum);
                st2.push(aa);
            }
            else{
                int v=0;
                while(i<n &&  str.charAt(i)>='0' && str.charAt(i)<='9') {
                    v*=10;
                    v+=str.charAt(i)-'0';
                    i++;
                }
                sum*=v;
                i--;
            }
            if(sum>b)
            break;
        }

        while(st2.size()>0 && b>0 && (b%st2.peek()!=0)){
            int a=st2.pop();
            b=b%a;
            if(b==0){
                return st1.pop()+"";
            }
            st1.pop();
        }
        return st1.pop()+"";
    }
}
