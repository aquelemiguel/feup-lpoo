package circuits;

public class GateNot extends LogicGate {
	
	public GateNot(LogicVariable y1, LogicVariable w2) throws ColisionException {
		this.inputs = new LogicVariable[1];
		
		this.inputs[0] = w2;
		this.output = y1;
		this.symbol = "NOT";

		if (y1.getCalculatedBy() != null){
			throw new ColisionException();
		}else{
			y1.setCalculatedBy(this);			
			y1.setFormula("NOT(" + w2.getFormula() + ")");
			updateGate();
		}
	}

	public void updateGate() {
		output.setValue(!inputs[0].getValue());
	}
	
}
