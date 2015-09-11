public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

TreeNode MinimalBST (int[] arary, start, end) {
  int mid = (start + end) / 2;
  TreeNode n = TreeNode(array[mid]);
  n.left = MinimalBST(array, start, mid - 1);
  n.right = MinalBST(array, mid + 1, end);
  return n;
}

TreeNode CreateMinimalBST(int[] array) {
  return MinimalBST(array, 0, length - 1);
}