package java10.xLib;

import java10.xLib.polynomial.AddExpression;
import mathnotation.Infix;import mathnotation.Prefix;

public class Demo {
	public static void main(String[] args) {
		//ConstExpression
		Expression e1 = new ConstExpression(5);
		System.out.println(e1.toString(new Infix()));
		System.out.println("evaluate const: " + e1.evaluate(2));
		System.out.println("derive const: " + e1.derive().toString(new Infix()));
		
		
		System.out.println("===================================");
		//MononialExpression a != 0, n != 0
		Expression e2 = MonomialExpression.createExpression(3, 2);
		System.out.println(e2.toString(new Infix()));
		System.out.println("evaluate mono 1: " + e2.evaluate(2));
		System.out.println("derive mono 1: " + e2.derive().toString(new Infix()));
		
		System.out.println("===================================");
		//MononialExpression a == 0, n != 0
		Expression e3 = MonomialExpression.createExpression(0, 2);
		System.out.println(e3.toString(new Infix()));
		System.out.println("evaluate mono 2: " + e3.evaluate(2));
		System.out.println("derive mono 2: " + e3.derive().toString(new Infix()));
		
		System.out.println("======================================");
		//MononialExpression a != 0, n == 0
		Expression e4 = MonomialExpression.createExpression(3, 0);
		System.out.println(e4.toString(new Infix()));
		System.out.println("evaluate mono 3: " + e4.evaluate(2));
		System.out.println("derive mono 3: " + e4.derive().toString(new Infix()));
		
		System.out.println("=======================================");
		//AddExpression
		Expression addEx = new AddExpression(MonomialExpression.createExpression(3, 2), MonomialExpression.createExpression(2, 1));
		System.out.println(addEx.toString(new Prefix()));
		System.out.println("evalue " + addEx.evaluate(2));
		
		
	}
}
