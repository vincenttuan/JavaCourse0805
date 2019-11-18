package pattern.decorator;

public class Tomato extends SideDish {
    
    public Tomato(Food food) {
        super(food);
        super.name = "蕃茄";
        super.price = 15;
    }
    
}
