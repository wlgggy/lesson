package Interface;

public class CompleteCalc extends Calculator {

	@Override
	public int multi(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 == 0) {
			return Error;
		}

		else {
			return (double) num1 / num2;
		}
	}

}
