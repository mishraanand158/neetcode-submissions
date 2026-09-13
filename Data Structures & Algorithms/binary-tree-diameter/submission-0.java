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
    int res = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        
        dd(root);
        return res;
       

    }

    public int dd(TreeNode root){

        if(root == null)
            return 0;

       int left= dd(root.left);
        int right= dd(root.right);

        res = Math.max(res, left+right);

        return 1+ Math.max(left,right);
    }
}
