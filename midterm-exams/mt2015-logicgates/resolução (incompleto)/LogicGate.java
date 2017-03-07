package circuits;

public abstract class LogicGate {
	
	protected LogicVariable[] inputs;
	protected LogicVariable output;
	protected String symbol;
	
	public abstract void updateGate();
	
	public LogicVariable[] getInputs(){
		return inputs;
	}
	
	public LogicVariable getOutput(){
		return output;
	}

	public Object getSymbol() {
		return symbol;
	}

	public String getFormula() {
		return output.getFormula();
	}

}
