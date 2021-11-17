package java10.xLib.polynomial;

import java10.xLib.Expression;
import java10.xLib.PolynomialExpression;
import mathnotation.MathNotation;

public class AddExpression extends PolynomialExpression {

	public AddExpression() {
	}

	public AddExpression(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public double evaluate(double x) {
		return a.evaluate(x) + b.evaluate(x);
	}

	@Override
	public Expression derive() {
		// TODO Auto-generated method stub
		return new AddExpression(a.derive(), b.derive());
	}	

	@Override
	public String toString(MathNotation mathNotation) {
		// TODO Auto-generated method stub
		return mathNotation.show("+", a.toString(mathNotation), b.toString(mathNotation));
	}
}
