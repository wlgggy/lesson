package OOP2;

public class Subway {
	int lineNumber;
	int PassengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void takeSubway(int money) {
		this.money += money;
		this.PassengerCount++;
	}

	public void showSubway() {
		System.out.println(lineNumber + "호선 지하철의 승객은" + PassengerCount + "명 이고," + "수입은 " + money + "원 입니다.");
	}
}
