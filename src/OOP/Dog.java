package OOP;

// 객체지향의 상속
public class Dog extends Animal {
	private String name;
	private int life;
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getLife() {
		return life;
	}
	
	// 생성자를 쓰지 않으면 JVM이 자동으로 기본생성자를 만든다.
	// 기본생성자는 클래스 이름과 동일하다.
	// 반드시 리턴값이 없다.
	// 생성과 동시에 호출, 상속되지 않는다.
	// 생성자 오버로드가 가능하다. ( 오버로드 : 메소드 이름이 같고, 매개변수나 반환값이 다른 메소드 )
	// 매개변수가 있는 생성자를 쓰는 경우에는 자동으로 기본 생성자가 생성되지 않는다.
	// 반드시 선언해야 한다.
	
	public Dog() {
		
	}
	
	public Dog(String name, int life) {
		this.name = name;
		this.life = life;
	}

	@Override
	public void act() {
		System.out.println(name + "이(가) 네발로 뛰어다닌다");
	}
	
	@Override
	public void sound() {
		// 추상 클래스의 일반 메소드를 선언된 메소드를 실행시킬 때는 반드시 super() 메소드를 사용해야 한다.
		// 추상 클래스의 일반 메소드를 실행하지 않을 때는 super() 메소드를 사용하지 않는다.ㅌ
//		super.sound();
		System.out.println(name + "이(가) 멍멍 짖는다");
	}

	@Override
	public void fight(Dog enemy) {
		double d = Math.random();
		System.out.println(enemy.name + "과 " + this.name + "이 싸우기 시작했다!");
		
		if(d >= 0.5) {
			enemy.setLife(enemy.life - 10);
			System.out.println(enemy.name + "과의 싸움에서 승리했다");
		} else {
			this.setLife(life - 10);
			System.out.println(enemy.name + "과의 싸움에서 패배했다");
		}
	}
}
