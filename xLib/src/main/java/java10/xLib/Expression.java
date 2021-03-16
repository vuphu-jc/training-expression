package java10.xLib;

public interface Expression {
	double evaluate(double x);
	Expression derive();
}
