package OOP2;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	// 모든 지하철은 호선 번호가 있어야 하므로 기본 생성자를 만들지 않기로 함
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 지하철 타기
	public void takeSubway(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	// 지하철 출발
	public void startRun() {
		System.out.println("지하철이 출발합니다");
		this.running();
	}
	
	// 지하철 운행
	public void running() {
		double d = Math.random();
		
		if(d >= 0.5) {
			System.out.println(lineNumber + "호선이 사고가 났습니다");
		}
	}
	
	// 지하철 상태 정보
	public void showSubway() {
		System.out.println(lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + money +"원입니다.	");
	}
}
