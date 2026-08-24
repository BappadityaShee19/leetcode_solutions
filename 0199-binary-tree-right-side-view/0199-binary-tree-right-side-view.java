/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;6
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        
        dfs(root,0,ls);
        return ls;
    }
    public void dfs(TreeNode root, int level, List<Integer> result){
        
        if(root == null){
            return;
        }
        
        if(level == result.size()){
            result.add(root.val);
        }
        dfs(root.right, level+1, result);
        dfs(root.left, level+1, result);
    }
}