import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LevelOrder
 */
public class LevelOrder {

    public static List<List<Integer>> lvOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        // get a queue to store tree elements
        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.add(root);

        // traverse the queue
        while (!treeQueue.isEmpty()) {
            // temp node to store each level nodes
            List<Integer> temp = new ArrayList<>();
            int size = treeQueue.size();
            for (int i = 0; i < size; i++) {
                // take one node out of queue,and remove it from queue
                TreeNode node = treeQueue.poll();
                temp.add(node.val);

                if (node.left != null)
                    treeQueue.add(node.left);
                if (node.right != null)
                    treeQueue.add(node.right);
            }
            res.add(temp);
        }
        return res;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode rootR = new TreeNode(20);
        root.right = rootR;
        rootR.left = new TreeNode(15);
        rootR.right = new TreeNode(7);

        List<List<Integer>> result = lvOrder(root);
        for (List<Integer> level : result) {
            System.out.print("[");
            for (Integer val : level) {
                System.out.print(val + ", ");
            }
            System.out.print("]");
        }
    }
}