import java.lang.reflect.Array;
import java.util.Collection;

public abstract class LogicGate {

    private LogicVariable l1, l2, l3;
    private LogicVariable[] inputs;
    private LogicVariable output;
    private String formula;

    public LogicGate(LogicVariable l1, LogicVariable l2, LogicVariable l3) throws ColisionException{
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.output = l1;
        this.inputs = new LogicVariable[]{l2, l3};
        if(this.output.getGate())
            throw new ColisionException();
        this.output.setGate(this);

        this.formula = this.getSymbol() + "(" + this.l2.getFormula() + "," + this.l3.getFormula() + ")";
        l1.setFormula(formula);
    }

    public LogicGate(LogicVariable l1, LogicVariable l2) throws ColisionException{
        this.l1 = l1;
        this.l2 = l2;
        this.output = l1;
        this.inputs = new LogicVariable[]{l2};
        if(this.output.getGate())
            throw new ColisionException();
        this.output.setGate(this);

        this.formula = this.getSymbol() + "(" + this.l2.getFormula() + ")";
        l1.setFormula(formula);
    }

    public LogicVariable getOutput(){
        return this.l1;
    }

    public LogicVariable[] getInputs(){
        return inputs;
    }

    public abstract String getSymbol();

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public abstract void setValue();
}
