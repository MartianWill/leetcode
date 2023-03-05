public class LowestCommonAncestor {
    public static TreeNode lowestAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            if (p.val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        Integer[] arr = { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 };

    }
}
