class Solution {
    int val=Integer.MAX_VALUE;
    int[]arr=new int[10000000];
    int[]min=new int[10000000];
    int idx=-1;
    
    int cmin=val;
    public void push(int x) {
        arr[++idx]=x;
        min[idx]=Math.min(x,cmin);
        cmin=min[idx];
    }

    public void pop() {
        if(idx!=-1){
        idx--;
        if(idx!=-1)
        cmin=min[idx];
        else
        cmin=Integer.MAX_VALUE;
        }
    }

    public int top() {
        if(idx==-1)
        return -1;
        return arr[idx];
    }

    public int getMin() {
        if(idx==-1)
        return -1;
        return min[idx];
    }
    
}
