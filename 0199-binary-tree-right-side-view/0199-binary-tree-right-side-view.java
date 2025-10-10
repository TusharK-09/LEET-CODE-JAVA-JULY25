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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> right = new ArrayList<>();

        q.offer(root);
        if(root == null) return right;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level =  new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode x = q.poll();
                level.add(x.val);

                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            } 

            ans.add(level);
        }
        //making right view
        for(List<Integer> list : ans){
            right.add(list.get(list.size() - 1));
        }
        return right;
    }
}