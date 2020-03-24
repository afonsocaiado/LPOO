import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StringBar extends Bar {

    Queue<Order> orders;

    public StringBar(){
        happyHour = false;
        observers = new ArrayList<>();
        orders = new LinkedList<>();
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }

    @Override
    public boolean isHappyHour(){
        return this.happyHour;
    }

    @Override
    public void startHappyHour(){
        happyHour = true;
        super.notifyObservers();
        int queueSize = orders.size();
        for (int i = 0; i < queueSize; i++) {
            order(orders.element().getDrink(), orders.element().getRecipe());
            orders.remove();
        }
    }

    @Override
    public void endHappyHour(){
        happyHour = false;
        super.notifyObservers();
    }

    public void addStandByOrder(StringDrink drink, StringRecipe recipe) {
        orders.add(new Order(drink, recipe));
    }
}
