package java10.xLib.polynomial;

import java10.xLib.ConstExpression;
import java10.xLib.Expression;
import java10.xLib.PolynomialExpression;

public class DivExpression extends PolynomialExpression {

	public DivExpression() {
		super();
	}

	public DivExpression(Expression a, Expression b) {
		super(a, b);
	}

	@Override
	public double evaluate(double x) {
		// TODO Auto-generated method stub
		return a.evaluate(x) / a.evaluate(x);
	}

	@Override
	public Expression derive() {
		// TODO Auto-generated method stub
		return new DivExpression(
				new AddExpression(new MulExpression(a.derive(), b),
						new MulExpression(new ConstExpression(-1), new MulExpression(a, b.derive()))),
				new MulExpression(b, b));
	}

}
