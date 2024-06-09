package OOP2;

public class Bus {
	int busNo; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 요금
	
	// 모든 버스는 버스 번호가 있어야 하므로 기본 생성자를 만들지 않기로 함
	public Bus(int busNo) {
		this.busNo = busNo;
	}
	
	// 버스 타기
	public void takeBus(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	// 버스 출발
	public boolean startRun() {
		System.out.println(busNo + "번 버스가 출발합니다");
		return this.running();
	}
	
	// 버스 운행
	public boolean running() {
		double d = Math.random();
		
		if(d >= 0.5) {
			System.out.println(busNo + "번이 사고가 났습니다");
			return false;
		}
		
		return true;
	}
	
	public void getOff() {
		this.passengerCount--;
	}
	
	// 버스 상태 정보
	public void showBus() {
		System.out.println(busNo + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money +"원입니다.	");
	}
}
