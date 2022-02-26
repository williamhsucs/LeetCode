class CloneGraph {
  // Space O(n)
  private Map<Node, Node> visited;

  public Solution() {
    visited = new HashMap<>();
  }

  /**
   * Time O(n)
   * Space O(h)
   */
  public Node cloneGraph(Node node) {
    if (node == null) return node;
    if (visited.containsKey(node)) return visited.get(node);
    Node root = new Node(node.val);
    visited.put(node, root);
    for (Node n : node.neighbors) {
      // Space O(h)
      root.neighbors.add(cloneGraph(n));
    }
    return root;
  }
}