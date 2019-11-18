package com;

class Book {
    void printPrice() {
        System.out.println("1840");
    }
}
class Ball {
    void printPrice() {
        System.out.println("990");
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        String s1 = "com.Book";
        String s2 = "com.Ball";
        
        Object o = Class.forName(s2).newInstance();
        if(o instanceof Book)
            ((Book)o).printPrice();
        else if(o instanceof Ball) {
            ((Ball)o).printPrice();
        }
    }
}
