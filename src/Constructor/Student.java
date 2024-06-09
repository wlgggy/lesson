package Constructor;

public class Student {
	private int sno;
	private String name;
	private String tel;
	private String address;
	
	// 매개변수가 있는 생성자를 만들고 기본 생성자를 사용하려면 기본 생성자를 반드시 만들어야 한다.
	// 기본생성자
	public Student() {
		
	}
	
	// 매개변수가 있는 생성자
	public Student(int sno, String name, String tel, String address) {
//		super();
		this.sno = sno;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
