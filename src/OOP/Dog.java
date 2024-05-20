package OOP;

//객체지향의 상속
public class Dog extends Animal {
	private String name;

	// 생성자를 쓰지 않으면 JVM이 자동으로 기본생성자를 만든다.
	// 기본생성자는 클래스 이름과 동일하다. 리턴값이 반드시 없다.
	// 생성과 동시에 호출
	// 생성자 오버로드가 가능하다. (메소드 이름이 같고, 매개변수가 다른 메소드)
	// 매개변수가 있는 생성자를 쓰는 경우에는 자동으로 기본 생성자가 생성되지 않는다.
	// 반드시 선언해야 한다.
	public Dog() {

	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("네발로 뛰어다닌다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		// 추상 클래스의 일반 메소드로 선언된 메소드를 실행시킬때는
		// 반드시 super() 메소드를 사용해야 한다.
		// 추상 클래스의 일반 메소드를 실행하지 않을때는
		// super() 메소드를 사용하지 않는다
		super.sound();
		System.out.println("멍멍");
	}
}
