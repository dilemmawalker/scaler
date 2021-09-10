    /*
    Definition for TreeNode.
    static public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; this.depth = -1;}
    }
    */

    static void solve(TreeNode root){          //Depth of Each Node
    
    sol(root,1);
    
    }
    static void sol(TreeNode root,int d){
        if(root==null)
        return;

        root.depth=d;
        sol(root.left,d+1);
        sol(root.right,d+1);
    }
        