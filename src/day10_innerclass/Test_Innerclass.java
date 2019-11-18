package day10_innerclass;

public class Test_Innerclass {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.job();
        System.out.println();
        Manager.Member member = manager.new Member();
        member.job();
    }
}
