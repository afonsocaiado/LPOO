import java.util.ArrayList;
import java.util.List;

public class CombinatorialCircuit {

    private List<LogicVariable> variables;

    public CombinatorialCircuit() {
        this.variables = new ArrayList<>();
    }

    public boolean addVariable(LogicVariable variable){
        for(LogicVariable v : variables){
            if(v.getName().equals(variable.getName()))
                return false;
        }
        variables.add(variable);
        return true;
    }

    public LogicVariable getVariableByName(String name){
        for(LogicVariable v : variables){
            if(v.getName().equals(name))
                return v;
        }
        return null;
    }
}
