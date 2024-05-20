package Abstract2;

public class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("인공지능이 운전합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("인공지능이 자동으로 브레이크를 조작하여 정지합니다.");
	}

}