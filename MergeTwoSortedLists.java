import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rNode = new ListNode(), cur;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode min = cur1.val > cur2.val ? cur2 : cur1;
        rNode = min;
        cur = min;
        while (cur1 != null || cur2 != null) {
            min = (cur1 == null) ? cur2 : cur1;
            if (cur1 != null && cur2 != null)
                min = cur1.val > cur2.val ? cur2 : cur1;
            cur.next = min;
        }
        return rNode;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists o = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode s = o.mergeTwoLists(l1, l2);
        while (s != null) {
            System.out.println(s.val);
            s = s.next;
        }
    }
}
