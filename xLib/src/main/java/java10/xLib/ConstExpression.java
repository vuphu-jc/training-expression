package java10.xLib;

import mathnotation.MathNotation;

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
	public String toString(MathNotation mathNotation) {
		// TODO Auto-generated method stub
		return  "" + value;
	}

}
