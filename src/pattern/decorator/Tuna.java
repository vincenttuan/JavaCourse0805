package pattern.decorator;

public class Tuna extends SideDish {
    
    public Tuna(Food food) {
        super(food);
        super.name = "鮪魚";
        super.price = 25;
    }
    
}
