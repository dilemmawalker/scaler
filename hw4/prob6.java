public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> ele) {
        int n=ele.size();
        int c1=-1,c2=-1,freq1=0,freq2=0;

            for(int i=0;i<n;i++){
                int a=ele.get(i);
                if(c1==a){
                    freq1++;
                }
                else if(c2==a){
                    freq2++;
                }
                else if(c1!=-1 && c2!=-1){
                    freq1--;
                    freq2--;

                    if(freq1==0)
                    c1=-1;
                    if(freq2==0)
                    c2=-1;
                }
                else{
                        if(c1==-1){
                            c1=a;
                            freq1++;
                        }
                        else{
                            c2=a;
                            freq2++;
                        }
                }
            }
            freq1=0;
            freq2=0;
            for(int i=0;i<n;i++){
                int a=ele.get(i);
                if(a==c1)
                freq1++;
                if(a==c2)
                freq2++;
            }
            if(freq1>(n/3))
            return c1;
            else if(freq2>(n/3))
            return c2;
            else
            return -1;

	}
}
