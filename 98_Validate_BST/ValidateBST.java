import java.util.Stack;

public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode temp = null;
        while (root != null || !treeStack.isEmpty()) {
            while (root != null) {
                treeStack.push(root);
                root = root.left;
            }
            root = treeStack.pop();
            if (temp != null && root.val <= temp.val)
                return false;
            temp = root;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr = { 5, 1, 4, null, null, 3, 6 };
        TreeNode root = new TreeNode();
        root = root.createTree(arr, 0);
        System.out.println(isValidBST(root));
    }
}
