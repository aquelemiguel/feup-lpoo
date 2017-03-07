package circuits;

public class LogicVariable {
	
	private String name, formula;
	private boolean value;
	private LogicGate calculatedBy;
	
	public LogicVariable(String name) {
		this.name = name;
		this.formula = name;
	}
	
	public LogicVariable(String name, boolean value) {
		this.name = name;
		this.formula = name;
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj){
		LogicVariable that = (LogicVariable) obj;
		
		if (this.getName() == that.getName()){
			return true;
		}
		return false;
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

	public LogicGate getCalculatedBy() {
		return calculatedBy;
	}
	public void setCalculatedBy(LogicGate logicGate){
		this.calculatedBy = logicGate;
	}

	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula){
		this.formula = formula;
	}

}
