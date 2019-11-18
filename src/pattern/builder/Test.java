package pattern.builder;

public class Test {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
                .setDoor(5)
                .setWheel(4)
                .create();
        
        Car car2 = new CarBuilder().setWheel(2).create();
        Car car3 = new CarBuilder().create();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        
        
    }
}
