 import java.util.*;
 public class prob11{                                  //TS & TDS of a String.
     public static Scanner scn=new Scanner(System.in);
     public static void main(String []args){
         String s="aabb";
         int a=abc(s);
         int b=uniqueLetterString(s);
        //  a=Math.abs(a-b);
         System.out.println(a+" "+b);
     }
 
 public static int uniqueLetterString(String S) {
        int res = 0;
        if (S == null || S.length() == 0)
            return res;    
        int[] showLastPosition = new int[128];
        int[] contribution = new int[128];
        int cur = 0;
        for (int i = 0; i < S.length(); i++) {
            char x = S.charAt(i);
            cur -= contribution[x]; // removing contribution of last occurence of ith char
            contribution[x] = (i - (showLastPosition[x] - 1)); // reset the contribution of ith char
            cur += contribution[x]; // add the contribution of ith char
            showLastPosition[x] = i + 1; // update the last occurence of ith char
            res += cur;
        }   
        return res;
    }   

    public static int abc(String S) {
        int[][] index = new int[26][2];
        for (int i = 0; i < 26; ++i) Arrays.fill(index[i], -1);
        int res = 0, N = S.length(), mod = (int)Math.pow(10, 9) + 7;
        for (int i = 0; i < N; ++i) {
            int c = S.charAt(i) - 'a';
            res = (res + (i - index[c][1]) * (index[c][1] - index[c][0]) % mod) % mod;
            index[c] = new int[] {index[c][1], i};
        }
        for (int c = 0; c < 26; ++c)
            res = (res + (N - index[c][1]) * (index[c][1] - index[c][0]) % mod) % mod;
        return res;
    }
 }