package java10.xLib;


public class ConstExpression implements Expression {

	private double value;

	public ConstExpression() {
	}

	public ConstExpression(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public double evaluate(double x) {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public Expression derive() {
		// TODO Auto-generated method stub
		return new ConstExpression(0);
	}
	
	@Override
	public String toString() {
		return "0";
	}
	
}
