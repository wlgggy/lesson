package Interface;

public class CalcTest {

	public static void main(String[] args) {
		System.out.println((double) 3 / 2);
		Calc c = new CompleteCalc();

		int n1 = 10;
		int n2 = 3;

		System.out.println(c.add(n1, n2));
		System.out.println(c.substract(n1, n2));
		System.out.println(c.multi(n1, n2));
		System.out.println(c.divide(n1, n2));

		c.description();
	}
}
