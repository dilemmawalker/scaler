public class Solution {                     //Same Format String
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final String str1, final String str2) {
        int n1=str1.length();
        int n2=str2.length();
        int p=0;
        if(n1>0 && n2>0 && str1.charAt(0)!=str2.charAt(0))
        return 0;
        for(int i=0;i<n2;i++){
            char ch1=str1.charAt(p);
            char ch2=str2.charAt(i);

            if(ch1!=ch2 && p+1<n1)
            p++;

            char ch=str1.charAt(p);
            if(ch!=ch2)
            return 0;
        }
        if(p<n1-1)
        return 0;
        return 1;

    } 
}
