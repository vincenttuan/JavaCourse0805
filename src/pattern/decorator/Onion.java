package pattern.decorator;

public class Onion extends SideDish {
    
    public Onion(Food food) {
        super(food);
        super.name = "洋蔥";
        super.price = 12;
    }
    
}
