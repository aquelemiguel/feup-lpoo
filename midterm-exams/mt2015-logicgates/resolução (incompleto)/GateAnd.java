package circuits;

public class GateAnd extends LogicGate {
	
	public GateAnd(LogicVariable w1, LogicVariable x1, LogicVariable x2) throws ColisionException {
		this.inputs = new LogicVariable[2];
		
		this.inputs[0] = x1;
		this.inputs[1] = x2;
		this.output = w1;
		this.symbol = "AND";
		
		if (w1.getCalculatedBy() != null){
			throw new ColisionException();
		}else{
			w1.setCalculatedBy(this);			
			w1.setFormula("AND(" + x1.getFormula() + "," + x2.getFormula() + ")");
			updateGate();
		}		
	}

	public void updateGate() {
		output.setValue(inputs[0].getValue() && inputs[1].getValue());
	}

}
