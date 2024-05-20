package OOP;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog happy = new Dog("happy");
		Cat cat = new Cat();
		
		dog.act();
		dog.sound();
		
		happy.act();
		happy.sound();
		
		cat.act();
		cat.sound();
	}
}
