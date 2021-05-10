public class Solution {
    public int[] solve(int a, int b, int c, int d) {
        ArrayList<Integer>arr=new ArrayList<>();
        int sum=a+b+c;
        int aa=a;
        a=Math.min(a,Math.min(b,c));
        c=Math.max(aa,Math.max(b,c));
        b=sum-a-c;

        arr.add(1);
        int c1=0,c2=0,c3=0;    //c1->a  ,  c2->b  ,  c3->c

        while(arr.size()<d+1){
            aa=arr.get(c1)*a;
            int bb=arr.get(c2)*b;
            int cc=arr.get(c3)*c;
            if(aa<=bb && aa<=cc){
                if(aa!=arr.get(arr.size()-1))
                arr.add(aa);
                c1++;
            }
            else if(bb<=aa && bb<=cc){
                if(bb!=arr.get(arr.size()-1))
                arr.add(bb);
                c2++;
            }
            else{
                if(cc!=arr.get(arr.size()-1))
                arr.add(cc);
                c3++;
            }
        }
        int[]ar=new int[d];
        for(int i=0;i<d;i++){
            ar[i]=arr.get(i+1);
        }
        return ar;
        
    }
}
