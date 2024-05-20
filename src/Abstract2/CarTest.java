package Abstract2;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car aiCar = new AICar();
		Car manualCar = new ManualCar();

		aiCar.run();
		manualCar.run();

		Car sonate = new Sonata();
		sonate.run();
	}

}