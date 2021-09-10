public class Solution {                     //finding median in 2 sorted lists O(N).
	// DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> arr1, final List<Integer> arr2) {
	    int n=arr1.size();
        int m=arr2.size();
        ArrayList<Integer>arr=new ArrayList<>();
        merge(arr,arr1,arr2);

        n=arr.size();
        if(n%2!=0){
            return arr.get(n/2);
        }
        else{
            return ((arr.get(n/2) + arr.get(n/2-1)*1.0)/2);
        }
	}   
    public void merge(ArrayList<Integer>arr,List<Integer> arr1,  List<Integer> arr2){
        int n=arr1.size();
        int m=arr2.size();
        int p1=0,p2=0;
        while(p1<n && p2<m){
            int a=arr1.get(p1);
            int b=arr2.get(p2);
            if(a<=b){
                arr.add(a);
                p1++;
            }
            else{
                arr.add(b);
                p2++;
            }
        }
        while(p1<n){
            arr.add(arr1.get(p1));
            p1++;
        }
        while(p2<m){
            arr.add(arr2.get(p2));
            p2++;
        }
    }
}
