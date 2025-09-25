public class Solution31 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current, pre = null, next;
        ListNode sentinel = new ListNode(0, head);
        current = head;
        ListNode p = sentinel;
        for (int i = 2; i <= left; i++) {
            p = current;
            current = current.next;
        }

        for (int i = 0; i < right - left + 1; i++) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        p.next.next = current;

        p.next = pre;

        return sentinel.next;

    }
}