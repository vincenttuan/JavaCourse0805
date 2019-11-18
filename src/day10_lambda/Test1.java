package day10_lambda;

public class Test1 {
    public static void main(String[] args) {
        // Java 7
        IPuppy puppy = new IPuppy(){
            public void skill() {
                System.out.println("拿報紙");
            }
        };
        puppy.skill();
        
        // Java 8 Lambda
        IPuppy puppy2 = () -> System.out.println("拎拖鞋1");
        IPuppy puppy3 = () -> {
            System.out.println("拎拖鞋2");
            System.out.println("拎拖鞋3");
            System.out.println("拎拖鞋4");
            System.out.println("拎拖鞋5");
        };
        puppy3.skill();
        
    }
}
