import java.util.List;

public class SmartStrategy implements OrderingStrategy {

    List<Order> orders;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if(bar.isHappyHour())
            recipe.mix(drink);
        else
            bar.addStandByOrder(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {

    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
