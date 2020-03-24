public class Order  {
    private StringDrink drink;
    private StringRecipe recipe;

    public Order(StringDrink drink, StringRecipe recipe) {
        this.drink = drink;
        this.recipe = recipe;
    }

    public StringDrink getDrink() {
        return drink;
    }

    public StringRecipe getRecipe() {
        return recipe;
    }
}
