public class Solution {
	public void arrange(ArrayList<Integer> a) {
        int n=a.size();
        for(int i=0;i<n;i++){
            int aa=a.get(i);
            a.set(i,aa*n);
        }

        for(int i=0;i<n;i++){
            int aa=a.get(i);
            int old=aa/n;
            int ne=a.get(old)/n;
            a.set(i,aa+ne);
        }

        for(int i=0;i<n;i++){
            int aa=a.get(i);
            a.set(i,aa%n);
        }
	}
}
