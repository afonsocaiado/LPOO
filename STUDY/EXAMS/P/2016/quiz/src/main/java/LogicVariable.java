import java.util.Objects;

public class LogicVariable {

    private String name;
    private boolean value;
    private LogicGate gate;
    private String formula;

    public LogicVariable(String name, boolean value){
        this.name = name;
        this.value = value;
        this.formula = name;
    }

    public LogicVariable(String name){
        this.name = name;
        this.value = true;
        this.formula = name;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public LogicGate getCalculatedBy(){
        return this.gate;
    }

    public boolean getGate() {
        if(this.gate != null)
            return true;
        return false;
    }

    public void setGate(LogicGate gate){
        this.gate = gate;
    }

    public void setFormula(String formula){
        this.formula = formula;
    }

    public String getFormula(){
        return this.formula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogicVariable that = (LogicVariable) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
