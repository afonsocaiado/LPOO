public class StringReplacer implements StringTransformer {

    private char from, to;

    public char getFrom() {
        return from;
    }

    public void setFrom(char from) {
        this.from = from;
    }

    public char getTo() {
        return to;
    }

    public void setTo(char to) {
        this.to = to;
    }

    public StringReplacer(char from, char to){
        this.from = from;
        this.to = to;
    }


    @Override
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(this.from, this.to));
    }

}
