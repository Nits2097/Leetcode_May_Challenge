/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode par1, par2;
    int x1, y1;
    public boolean isCousins(TreeNode root, int x, int y) {
        getDepth(root,null,x,y,0);
        return (x1==y1 && par1!=par2);
    }
    public void getDepth(TreeNode root, TreeNode parent, int x, int y, int level){
        if(root==null) return;
        if(root.val==x) {
            x1 = level;
            par1 = parent;
        }
        else if(root.val==y){
            y1= level;
            par2 = parent;
        }
        else{
            getDepth(root.left,root,x,y,level+1);
            getDepth(root.right,root,x,y,level+1);

        }
        
    }
}