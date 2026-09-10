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
    int sum(TreeNode root){
        if(root==null){
            return 0;
        }return root.val+sum(root.right)+sum(root.left);
    }int count(TreeNode root){
        if(root==null){
            return 0;
        }return 1+count(root.right)+count(root.left);
    }
    
    public int averageOfSubtree(TreeNode root) {
        Stack<TreeNode> s=new Stack();
        s.push(root);
        int res=0;
        while(!s.isEmpty()){
            TreeNode node=s.pop();
            int d=sum(node)/count(node);
            if(d==node.val) res++;
            if(node.right!=null){
                s.push(node.right);
            }if(node.left!=null){
                s.push(node.left);
            }
        }return res;
    }
}