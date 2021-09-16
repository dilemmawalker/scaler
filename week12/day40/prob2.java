public class Solution {                         //Add Binary Strings
    public String addBinary(String str1, String str2) {
        if(str2.length()>str1.length()){
            String temp=str1;
            str1=str2;
            str2=temp;
        }
        int n1=str1.length();
        int n2=str2.length();
        String ans="";
        int c=0;
        int p=n2-1;
        for(int i=n1-1;i>=0;i--){
            int a=str1.charAt(i)-'0';
            int b=0;
            if(p>=0)
            b=str2.charAt(p)-'0';

            int sum=a+b+c;
            if(sum==3){
                c=1;
                ans="1"+ans;
            }
            else if(sum==2){
                c=1;
                ans="0"+ans;
            }
            else if(sum==1){
                ans="1"+ans;
                c=0;
            }
            else{
                ans="0"+ans;
                c=0;
            }
            p--;
        }
        if(c==1)
        ans="1"+ans;
        return ans;
    }   
}
