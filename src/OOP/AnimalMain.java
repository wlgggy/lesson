package OOP;

public class AnimalMain {
	public static void main(String[] args) {
		// 모든 객체는 생성해야 사용할 수 있다.
		Dog	wook = new Dog("이정욱", 70);
		Dog hoon = new Dog("정재훈", 100);
		Cat cat =  new Cat();
		
		wook.act();
		wook.sound();
		
		while(wook.getLife() > 0 && hoon.getLife() > 0) {
			wook.fight(hoon);	
		}
		
		hoon.act();
		hoon.sound();
		
		cat.act();
		cat.sound();
	}
}
