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
  
  
  int count = 0;

  /**
   * Time: O(n)
   * Space: O(n)
   */
  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if (root == null) return "n";
    return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
  }
  
  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    String s[] = data.split(",");
    return exeDeserialize(s);
  }

  /**
   * Time: O(n)
   * Space: O(n)
   */
  public TreeNode exeDeserialize(String s[]) {
    if (!s[count].equals("n")) {
      TreeNode node = new TreeNode(Integer.valueOf(s[count++]));
      node.left = exeDeserialize(s);
      node.right = exeDeserialize(s);
      return node;
    } else {
      count++;
      return null;
    }
  }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));