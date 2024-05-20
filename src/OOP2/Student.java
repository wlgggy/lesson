package OOP2;

public class Student {
	private int sno;
	private String name;
	private int money;

	// 기본 생성자
	public Student() {

	}

	// sno, name을 받는 생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// sno, name, money를 받는 생성자
	public Student(int sno, String name, int money) {
		this.sno = sno;
		this.name = name;
		this.money = money;
	}

	// 학생 정보 출력 메서드
	public void showStudent() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}

	// 학생 이름 반환 메서드
	public String getStudent() {
		return name;
	}

	// 버스를 타는 메서드
	public void takeBus(Bus bus) {
		bus.takeBus(500);
		this.money -= 500;
	}

	public void takeSubway(Subway subway) {
		subway.takeSubway(550);
		this.money -= 550;
	}
}
