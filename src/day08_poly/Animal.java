package day08_poly;

public class Animal {
    
    private int feet;
    private String name;

    public Animal(int feet, String name) {
        this.feet = feet;
        this.name = name;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void move() {
        System.out.println("會動");
    }
    
}
