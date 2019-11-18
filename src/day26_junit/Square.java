package day26_junit;


public class Square {
    private int len;
    public Square(int len) {
        this.len = len;
    }
    
    public int area() {
        return len * len;
    }
}
