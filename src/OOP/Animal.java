package OOP;

// 추상클래스는 abstract 예악어 사용
// abstract 메소드는 선언만 가능하다.
public abstract class Animal {
	public abstract void act();
	
	public abstract void fight(Dog enemy);
	
	public void sound() {
		System.out.println("짖는다");
	}
}
