public class Solution {
    public int[] solve(int[] arr) {    
        int n=arr.length;
        int[]ans=new int[n];
        LinkedList<Integer>ll=new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.addLast(arr[i]);
        }
        int idx=0;
        while(idx++<n){
            int c=0;
            for(int i=0;i<n;i++){
                Node a=ll.removeFirst();
                
            }
        }
    }
}
