package pattern.builder;

public class CarBuilder implements ICarBuilder {
    private Car car = new Car();

    @Override
    public ICarBuilder setWheel(int wheel) {
        car.setWheel(wheel);
        return this;
    }

    @Override
    public ICarBuilder setDoor(int door) {
        car.setDoor(door);
        return this;
    }

    @Override
    public Car create() {
        return car;
    }

    
    
}
