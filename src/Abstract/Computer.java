package Abstract;

//추상 메소드를 가진 클래스는 반드시 추상클래스로 만들어야 한다.
public abstract class Computer {
	// 추상 메소드는 구현부가 없는 메소드로 만들어야 한다.
	// 구현의 책임을 하위 클래스에게 위임할때 추상클래스를 만든다.
	public abstract void display();

	public abstract void typing();

	// 추상클래스는 일반 메소를 가질 수 있다.
	public void turnOn() {
		System.out.println("컴퓨터를 켭니다.");

	}

	public void turnOff() {
		System.out.println("컴퓨터를 끕니다.");
	}
}