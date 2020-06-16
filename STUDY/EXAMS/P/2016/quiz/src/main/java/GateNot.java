public class GateNot extends LogicGate {

    public GateNot(LogicVariable l1, LogicVariable l2) throws ColisionException, CycleException{
        super(l1, l2);

        if (l2.getCalculatedBy() != null) {
            if (l2.getCalculatedBy().getInputs()[0] == l1)
                throw new CycleException();

            if (l2.getCalculatedBy().getInputs()[1] == l1)
                throw new CycleException();
        }

        setValue();
    }

    public void setValue(){
        boolean result = !this.getInputs()[0].getValue();
        this.getOutput().setValue(result);
    }

    @Override
    public String getSymbol() {
        return "NOT";
    }
}
