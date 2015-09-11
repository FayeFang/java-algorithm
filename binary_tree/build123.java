public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public void build123() {
  TreeNode root = new TreeNode(2);
  root.left = new TreeNode(1);
  root.right = new TreeNode(3);
}

public int size(TreeNode root) {
  if (root == null) return 0;

  int size = 1;
  while (root.left != null || roo.right != null) {
    size += size(left) + size(right);
  }

  return size;
}

public int maxDepth(TreeNode root) {
  if (root == null) return 0;

  int depth = 1;

  while (root.left != null || root.right != null) {
    depth += maxDepth(maxDepth(root.left), maxDepth(root.right));
  }

  return depth;
}

public int minValue(TreeNode root) {
  if (root == null) return null;

  TreeNode current = root;

  while (current.left != null) {
    current = current.left
  }
  return current.val;
}

public TreeNode printTree(TreeNode root) {

}