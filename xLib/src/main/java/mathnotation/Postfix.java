package mathnotation;

public class Postfix implements MathNotation {

	@Override
	public String show(String operator, String operand1, String operand2) {
		// TODO Auto-generated method stub
		return operand1 + operand2 + operator;
	}

}
