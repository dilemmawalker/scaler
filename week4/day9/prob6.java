public class Solution {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(E>C || F>D || G<A || H<B)
        return 0;

        int a=Math.max(A,E);
        int b=Math.max(B,F);
        int c=Math.min(G,C);
        int d=Math.min(D,H);

        int l=a-c>=0?a-c:c-a;
        int br=b-d>=0?b-d:d-b;

        return l*br;
    }
}
