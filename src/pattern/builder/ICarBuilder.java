package pattern.builder;

public interface ICarBuilder {
    public ICarBuilder setWheel(int wheel);
    public ICarBuilder setDoor(int door);
    public Car create();
}
