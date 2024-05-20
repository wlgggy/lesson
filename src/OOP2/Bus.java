package OOP2;

public class Bus {
	int busNo;
	int PassengerCount;
	int money;

	public Bus(int busNo) {
		this.busNo = busNo;
	}

	public void takeBus(int money) {
		this.money += money;
	}

	public void showBus() {
		System.out.println(busNo + "번 버스의 승객은" + PassengerCount + "명 이고," + "수입은 " + money + "원 입니다.");
	}
}
