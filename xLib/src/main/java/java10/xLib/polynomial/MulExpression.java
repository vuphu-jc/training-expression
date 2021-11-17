package java10.xLib.polynomial;

import java10.xLib.Expression;
import java10.xLib.PolynomialExpression;
import mathnotation.MathNotation;

public class MulExpression extends PolynomialExpression {

	public MulExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MulExpression(Expression a, Expression b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double evaluate(double x) {
		return a.evaluate(x) * b.evaluate(x);
	}

	@Override
	public Expression derive() {
		return new AddExpression(new MulExpression(a.derive(), b), new MulExpression(a, b.derive()));
	}

	@Override
	public String toString(MathNotation mathNotation) {
		// TODO Auto-generated method stub
		return mathNotation.show("*", a.toString(mathNotation), b.toString(mathNotation));
	}
}
