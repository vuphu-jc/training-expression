package java10.xLib;

import java10.xLib.polynomial.AddExpression;

public class Demo {
	public static void main(String[] args) {
		Expression e1 = new ConstExpression(5);
		Expression e2 = new MonomialExpression(5, 2);
		
		Expression e3 = new AddExpression(new MonomialExpression(2, 2), new MonomialExpression(3, 1));
		System.out.println(e3.evaluate(2));
		
		System.out.println(e3.derive());
		
	}
}
