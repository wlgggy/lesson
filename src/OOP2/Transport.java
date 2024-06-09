package OOP2;

public class Transport {
	public static void main(String[] args) {
		// 학생이 버스 타도록 프로그래밍 하기
		// 학생 객체를 만들기
		Student hoon = new Student(20412, "정재훈", 10000);
		Student wook = new Student(20411, "이정욱", 3000);
		// 버스 객체를 만들기
		Bus bus152 = new Bus(152);
		Bus bus444 = new Bus(444);
	
		
		// 지하철 객체 만들기
		Subway subway101 = new Subway(101);
		
		// 학생이 버스를 타기
		hoon.takeBus(bus444);
		// 학생 정보 출력하기
		hoon.showStudent();
		// 버스 정보 출력하기
		bus152.showBus();
		bus444.showBus();
		
		boolean isOk = bus444.startRun();
		
		if(isOk) {
			bus444.getOff();
			// 학생이 지하철을 타기
			hoon.takeSubway(subway101);
			wook.takeSubway(subway101);
			hoon.showStudent();
			wook.showStudent();
			subway101.showSubway();
			subway101.startRun();
		}
		
	}
}
