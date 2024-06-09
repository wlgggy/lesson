package Abstract2;

public class Sonata extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("소나타를 운전합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("소나타를 정지합니다.");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("소나타의 시동을 켭니다.");
	}

	@Override
	public void trunOffCar() {
		// TODO Auto-generated method stub
		System.out.println("소나타의 시동을 끕니다.");
	}

}
