/**
 * MiddleNode
 */
public class MiddleNode {

    public static ListNode middleNode(ListNode head) {
        ListNode mid, temp;
        mid = temp = head;
        while (temp != null && temp.next != null) {
            mid = mid.next;
            temp = temp.next.next;
        }
        return mid;
    }

    public static void main(String[] args) {
        ListNode heaListNode = new ListNode(1);
        heaListNode.next = new ListNode(2);
        heaListNode.next.next = new ListNode(3);
        heaListNode.next.next.next = new ListNode(4);
        heaListNode.next.next.next.next = new ListNode(5);

        ListNode result = middleNode(heaListNode);
        System.out.print(result.val);

    }
}
