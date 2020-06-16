public class GateOr extends LogicGate {

    public GateOr(LogicVariable l1, LogicVariable l2, LogicVariable l3) throws ColisionException, CycleException{
        super(l1, l2, l3);

        if (l2.getCalculatedBy() != null) {
            if (l2.getCalculatedBy().getInputs()[0] == l1)
                throw new CycleException();

            if (l2.getCalculatedBy().getInputs()[1] == l1)
                throw new CycleException();
        }

        if (l3.getCalculatedBy() != null) {
            if (l3.getCalculatedBy().getInputs()[0] == l1)
                throw new CycleException();

            if (l3.getCalculatedBy().getInputs()[1] == l1)
                throw new CycleException();
        }

        setValue();
    }

    public void setValue(){
        boolean result = this.getInputs()[0].getValue() || this.getInputs()[1].getValue();
        this.getOutput().setValue(result);
    }

    @Override
    public String getSymbol() {
        return "OR";
    }
}
