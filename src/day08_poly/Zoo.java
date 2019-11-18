package day08_poly;

public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird(2, "白文鳥");
        Lion lion = new Lion(4, "獅子");
        Ostrich ostrich = new Ostrich("鴕鳥");
        
        Zoo zoo = new Zoo();
        zoo.print(bird);
        
    }
    
    public void print(Animal animal) {
        System.out.printf("%s 有 %d 隻腳\n", animal.getName(), animal.getFeet());
        animal.move();
    }
    
}
