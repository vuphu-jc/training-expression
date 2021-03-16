package java10.xLib;

public class MonomialExpression implements Expression {

	private double a;
	private double n;

	public MonomialExpression() {
		super();
	}

	public MonomialExpression(double a, double n) {
		this.a = a;
		this.n = n;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	@Override
	public double evaluate(double x) {
		// TODO Auto-generated method stub
		return a * Math.pow(x, n);
	}

	@Override
	public Expression derive() {
		// TODO Auto-generated method stub
		return new MonomialExpression(a * n, n - 1);
	}
	
	@Override
	public String toString() {
		return a + "x" + "^" + n;
	}
	

}
