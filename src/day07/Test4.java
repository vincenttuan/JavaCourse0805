package day07;

public class Test4 {
    public static void main(String[] args) {
        // a 串列
        ListNode a = new ListNode(1);
        ListNode a3 = new ListNode(3);
        ListNode a5 = new ListNode(5);
        ListNode a7 = new ListNode(7);
        a.next = a3;
        a3.next = a5;
        a5.next = a7;
        
        // b 串列
        ListNode b = new ListNode(2);
        ListNode b4 = new ListNode(4);
        b.next = b4;
        
        System.out.println(a);
        System.out.println(b);
        
        ListNode c = mergeTwoLists(a, b);
        System.out.println(c);
        
    }
    
    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode c = new ListNode(-1);
        ListNode cur = c;
        while(a != null && b != null) {
            if(a.val < b.val) {
                cur.next = a;
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        cur.next = (a == null)? b : a;
        return c.next;
    }
    
}
