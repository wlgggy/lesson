package Interface;

// 인터페이스의 모든 메서드를 구현하면 클래스 이름의 빨간줄이 사라지는데,
// 추상 클래스로 클래스를 선언하는 경우에는 실제 사용하는 크랠스에서 구현하면 되기 때문에,
// 메소드를 재정의 하지 않아도 에러가 없다.
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}
