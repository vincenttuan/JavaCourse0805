package day08_poly;

public class Zoo2 {
    public static void main(String[] args) {
        Animal a1 = new Ostrich("鴕鳥");
        
        ((Bird)a1).eat();
        ((Bird)a1).move();
        ((Ostrich)a1).spirit();
        
        //((Lion)a1).move();
        if(a1 instanceof Lion) {
            ((Lion)a1).move();
        } else {
            System.out.println("不可轉");
        }
        
    }
    
    
}
