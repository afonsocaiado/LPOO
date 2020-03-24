import java.util.ArrayList;
import java.util.List;

public class StringRecipe {

    private List<StringTransformer> transformers = new ArrayList<>();

    public StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    public void mix(StringDrink drink){
        for(int i = 0; i < transformers.size(); i++){
            transformers.get(i).execute(drink);
        }
    }

}
