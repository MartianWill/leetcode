import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreePreorder {
    public static List<Integer> result = new ArrayList<>();

    public static List<Integer> preorder(Node root) {
        if (root == null) {
            return result;
        }
        result.add(root.val);
        for (Node i : root.children) {
            preorder(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node2.children.add(node5);
        node2.children.add(node6);

        List<Integer> orderedList = preorder(root);
        for (int i = 0; i < orderedList.size(); i++) {
            System.out.print(orderedList.get(i));
        }
    }

}
