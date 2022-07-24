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

public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rNode = new ListNode();
        ListNode curNode = rNode, preNode = null;
        ListNode curNode1 = l1;
        ListNode curNode2 = l2;
        int x = 0;
        while (curNode1 != null || curNode2 != null) {
            int n1 = (curNode1 != null) ? curNode1.val : 0;
            int n2 = (curNode2 != null) ? curNode2.val : 0;
            int i = curNode.val + n1 + n2;

            System.out.println(n1 + " " + n2 + " " + curNode.val);

            curNode.val = i % 10;
            x = i / 10;

            preNode = curNode;
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = x;

            curNode1 = (curNode1 != null) ? curNode1.next : null;
            curNode2 = (curNode2 != null) ? curNode2.next : null;
        }
        if (curNode.val == 0)
            preNode.next = null;
        return rNode;
    }

    public static void main(String[] args) {
        AddTwoNumber obj = new AddTwoNumber();
        // ListNode l1 = new ListNode(9);
        // l1.next = new ListNode(9);
        // l1.next.next = new ListNode(9);
        // l1.next.next.next = new ListNode(9);
        // l1.next.next.next.next = new ListNode(9);
        // l1.next.next.next.next.next = new ListNode(9);
        // l1.next.next.next.next.next.next = new ListNode(9);

        // ListNode l2 = new ListNode(9);
        // l2.next = new ListNode(9);
        // l2.next.next = new ListNode(9);
        // l2.next.next.next = new ListNode(9);

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode r = obj.addTwoNumbers(l1, l2);
        while (r != null) {
            System.out.print(r.val + " -> ");
            r = r.next;
        }
    }
}
