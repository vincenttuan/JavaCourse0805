
package pattern.decorator;

public class SideDish extends Food {
    
    protected Food food;
    
    public SideDish(Food food){
        this.food = food;
    }

    @Override
    public String getName() {
        return name + " + " + food.getName();
    }

    @Override
    public int getPrice() {
        return price + food.getPrice();
    }
    
}

