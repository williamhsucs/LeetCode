/**
 * Problem
 * https://leetcode.com/problems/find-duplicate-subtrees/
 * 
 * *************************************************************
 * 
 * Input: root = [1,2,3,4,null,2,4,null,null,4]
 * 
 * Output: [[2,4],[4]]
 * 
 * *************************************************************
 * 
 * Input: root = [2,1,1]
 * 
 * Output: [[1]]
 * 
 * *************************************************************
 * 
 * Input: root = [2,2,2,3,null,3,null]
 * 
 * Output: [[2,3],[3]]
 * 
 * *************************************************************
 */
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
/**
 * Wonderful Solution
 * Author: alexander
 */ 
class FindDuplicateSubtreesAlexander {
  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    // Space O(n)
    Map<String, List<TreeNode>> map = new HashMap<>();
    // Space O(n)
    List<TreeNode> list = new ArrayList<>();
    /**
     * Time O(n)
     * Space O(h)
     */
    check(root, map);
    
    // Time O(n)
    for (List<TreeNode> l : map.values()) {
      if (l.size() > 1) list.add(l.get(0));
    }
    return list;
  }

  private String check(TreeNode node, Map<String, List<TreeNode>> map) {
    if (node == null) return "";
    String s = "(" + check(node.left, map) + node.val + check(node.right, map) + ")";
    if (!map.containsKey(s)) map.put(s, new ArrayList<TreeNode>());
    map.get(s).add(node);
    return s;
  }
}