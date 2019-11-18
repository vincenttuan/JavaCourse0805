package day07;

public class Test2 {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        
        ListNode c = new ListNode(-1);
        ListNode cur = c;
        if(a.val < b.val) {
            cur.next = a;
            cur = cur.next;
            cur.next = b;
        } else {
            cur.next = b;
            cur = cur.next;
            cur.next = a;
        }
        System.out.println(c);
    }
    
}
