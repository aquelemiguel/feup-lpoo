package circuits;

public class GateOr extends LogicGate {
	
	public GateOr(LogicVariable w2, LogicVariable w1, LogicVariable x3) throws ColisionException {
		this.inputs = new LogicVariable[2];
		
		this.inputs[0] = w1;
		this.inputs[1] = x3;
		this.output = w2;
		this.symbol = "OR";

		if (w2.getCalculatedBy() != null){
			throw new ColisionException();
		}else{
			w2.setCalculatedBy(this);			
			w2.setFormula("OR(" + w1.getFormula() + "," + x3.getFormula() + ")");
			updateGate();
		}		
	}

	public void updateGate() {
		output.setValue(inputs[0].getValue() || inputs[1].getValue());		
	}
	
}
