public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // temp node to hold merged list
        ListNode temp = new ListNode(0);
        // store head
        ListNode current = temp;

        // while no lists empty
        while (list1 != null && list2 != null) {
            // compare , current.next is whichever smaller, curretn move ot next
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null)
            current.next = list1;
        if (list2 != null)
            current.next = list2;
        // discard first temp node
        return temp.next;

    }

    public static void main(String[] args) {
        // first linked lilst
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // second linked list
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(list1, list2);
        // temp list for print
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
