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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curpath = new ArrayList<>();

        dfs(root, targetSum, curpath, result);
        return result;
    }
        private void dfs(TreeNode node, int remain, List<Integer> curpath, List<List<Integer>> result){
            if(node == null) return;

            curpath.add(node.val);
            if(node.left == null && node.right== null && remain == node.val){
                result.add(new ArrayList<>(curpath));
            }
            else{
                dfs(node.left, remain-node.val, curpath, result);
                dfs(node.right, remain-node.val, curpath, result);
            }
            curpath.remove(curpath.size() - 1);
        }
    
}