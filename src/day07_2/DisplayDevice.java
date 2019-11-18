package day07_2;

public class DisplayDevice {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.draw();
        computer.power();
        
        Phone phone = new Phone();
        phone.call();
        phone.draw();
        phone.power();
    }
}
