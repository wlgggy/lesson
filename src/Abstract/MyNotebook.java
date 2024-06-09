package Abstract;

public class MyNotebook extends Notebook {

	@Override
	public void changeBattery() {
		// TODO Auto-generated method stub
		System.out.println("노트북의 배터리를 바꿉니다.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("노트북 디스플레이를 표시합니다.");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("노트북에 타이핑합니다");
	}

}