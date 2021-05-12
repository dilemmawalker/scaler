public class Solution {
    public int solve(String str) {
        int n=str.length();
        str=str.toLowerCase();
        // System.out.print(str);
        int sum=0;
       
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            sum=(sum+(n-i))%10003;
        }
        return sum;
    }
}
