package java10.xLib;

import mathnotation.MathNotation;

public interface Expression {
	double evaluate(double x);
	Expression derive();
	String toString(MathNotation mathNotation);
}
