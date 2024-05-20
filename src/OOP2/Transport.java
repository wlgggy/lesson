package OOP2;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생이 버스타도록 프로그래밍 하기
		// 학생객체를 만들기
		Student kim = new Student(20401, "김영호", 10000);
		Student yoon = new Student(20402, "윤지상", 15000);
		// 버스객체를 만들기
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);

		Subway subway1 = new Subway(1);
		// 학생이 버스를 타기
		kim.takeBus(bus100);
		yoon.takeSubway(subway1);
		// 학생정보 출력하기
		kim.showStudent();
		yoon.showStudent();
		// 버스정보 출력하기
		bus100.showBus();
		bus200.showBus();

		subway1.showSubway();
	}

}
