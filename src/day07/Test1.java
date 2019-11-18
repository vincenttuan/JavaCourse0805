package day07;

public class Test1 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a3 = new ListNode(3);
        ListNode a5 = new ListNode(5);
        ListNode a7 = new ListNode(7);
        
        System.out.println(a1);
        System.out.println(a3);
        System.out.println(a5);
        System.out.println(a7);
        
        a1.next = a3;
        a3.next = a5;
        a5.next = a7;
        System.out.println(a1);
    }
}
