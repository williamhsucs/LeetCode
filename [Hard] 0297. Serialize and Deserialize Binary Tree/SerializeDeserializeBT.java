/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
  
  String s;

  /**
   * Time: O(n)
   * Space: O(n)
   */
  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if (root == null) return "n";
    return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
  }

  /**
   * Time: O(n^2)
   * Space: O(n)
   */
  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    s = data;
    if (data.charAt(0) != 'n') {
      // indexOf time is O(n), but according to constraints the max indexOf time is 5
      int idx = s.indexOf(",");
      // substring time is O(n)
      TreeNode node = new TreeNode(Integer.valueOf(s.substring(0, idx)));
      // recursive time is O(n)
      node.left = deserialize(s.substring(idx + 1));
      idx = s.indexOf(",");
      node.right = deserialize(s.substring(idx + 1));
      return node;
    } else {
      return null;
    }
  }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));