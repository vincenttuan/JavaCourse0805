package day07;

public class Test3 {
    public static void main(String[] args) {
        ListNode a = new ListNode(30);
        ListNode b = new ListNode(5);
        
        ListNode c = new ListNode(-1);
        ListNode cur = c;
        if(a.val < b.val) {
            cur.next = a;
            a = a.next;
        } else {
            cur.next = b;
            b = b.next;
        }
        cur = cur.next;
        
        cur.next = (a == null)? b : a;
        System.out.println(c);
    }
    
    
    
}
