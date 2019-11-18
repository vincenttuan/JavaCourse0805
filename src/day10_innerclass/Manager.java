package day10_innerclass;

public class Manager {
    private int cash = 100;
    private static String deptName = "IT";
    
    public class Member {
        private int cash = 40;
        public void job() {
            int cash = 20;
            System.out.println("寫程式");
            System.out.println(cash);
            System.out.println(this.cash);
            System.out.println(Manager.this.cash);
            System.out.println(Manager.deptName);
        }
    }

    public void job() {
        Member member = new Member();
        member.job();
        System.out.println("寫報告");
    }

}
