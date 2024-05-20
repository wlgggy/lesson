package Abstract;

//추상클래스를 상속받아 새로운 추상클래스를 만들 수 있다.
public abstract class Notebook extends Computer {

	// 상속된 추상클래스에서는 부모 추상클래스에 들어 있는 추상메소드를 추가로 작성할 수도 있고 작성하지 않아도 된다.
	public abstract void changeBattery();
}