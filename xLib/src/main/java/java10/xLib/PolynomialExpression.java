package java10.xLib;

public abstract class PolynomialExpression implements Expression {

	protected Expression a;
	protected Expression b;

	public PolynomialExpression(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}

	public PolynomialExpression() {
	}

	public Expression getA() {
		return a;
	}

	public void setA(Expression a) {
		this.a = a;
	}

	public Expression getB() {
		return b;
	}

	public void setB(Expression b) {
		this.b = b;
	}
	
}
