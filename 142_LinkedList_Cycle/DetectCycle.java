public class DetectCycle {
    public static ListNode detectCycle(ListNode head, ListNode pos) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null)
            return null;
        while (head != slow) {
            slow = slow.next;
            head = head.next;
            pos.val = pos.val + 1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = head.next;

        ListNode pos = new ListNode(0);

        detectCycle(head, pos);
        System.out.println("there is a cycle at: index " + pos.val);
    }
}
