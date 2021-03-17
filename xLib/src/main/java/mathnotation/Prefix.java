package mathnotation;

public class Prefix implements MathNotation {

	@Override
	public String show(String operator, String operand1, String operand2) {
		// TODO Auto-generated method stub
		return operator + " " + operand1 + " " + operand2;
	}

}
