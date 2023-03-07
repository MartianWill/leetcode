public class LowestCommonAncestor {
    public static TreeNode lowestAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (((root.val - p.val) > 0 && (root.val - q.val) > 0)
                || ((root.val - p.val) < 0 && (root.val - q.val) < 0)) {
            if (p.val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
        /*
         * if(root.val > p.val && root.val > q.val){
         * return lowestCommonAncestor(root.left,p,q);
         * }
         * if(root.val < p.val && root.val < q.val){
         * return lowestCommonAncestor(root.right,p,q);
         * }
         * return root;
         */
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        Integer[] arr = { 0, -1000000000, 1000000000 };
        root = root.createTree(arr, 0);
        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode result = lowestAncestor(root, p, q);
        System.out.println(result.val);
    }
}
