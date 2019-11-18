package pattern.builder;

public class Car {
    private int wheel = 4;
    private int door = 4;

    public Car() {
    }

    public Car(int wheel, int door) {
        this.wheel = wheel;
        this.door = door;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", door=" + door + '}';
    }
    
    
    
}
