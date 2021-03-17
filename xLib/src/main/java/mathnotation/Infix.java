package mathnotation;

public class Infix implements MathNotation {

	@Override
	public String show(String operator, String operand1, String operand2) {
		return operand1 + " " + operator + " " + operand2;
	}
	
}
