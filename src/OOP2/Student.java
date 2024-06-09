package OOP2;

public class Student {
	private int sno;
	private String name;
	private int money;
	
	// 객체는 생성자가 필요하다.

	public Student() {
	}
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	

	public Student(int sno, String name, int money) {
		this.sno = sno;
		this.name = name;
		this.money = money;
	}
	
	// method 만들기
	// 학생의 잔고 정보 출력
	public void showStudent() {
		System.out.println(name + "님의 남은 돈은 " + money + "원입니다");
	}
	
	public String getStudent() {
		return name;
	}
	
	// 교통수단 태우기
	// 버스 태우기
	public void takeBus(Bus bus) {
		// 어떤 버스를 탈 것인지
		bus.takeBus(500);
		// 요금 지불
		this.money -= 500;
	}
	
	// 지하철 태우기
	public void takeSubway(Subway subway) {
		subway.takeSubway(730);
		this.money -= 730;
	}

	
	// 택시 태우기
}
