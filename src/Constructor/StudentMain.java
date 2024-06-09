package Constructor;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		Student kim = new Student();
		
		kim.setSno(20401);
		kim.setName("김영호");
		kim.setTel("1234567");
		kim.setAddress("서울역");
		
		Student yoon = new Student(20406, "윤지상", "12341234", "서울시 성북구 돈암동 정릉로 52길 42");
		
		// 학생 배열 만들기
		Student[] student = new Student[10];
		
		// 학생 데이터 넣어보기
		// 배열로 생성된 student[0] ~ [9]까지는 모두 객체이므로 생성자를 사용하고 값을 넣어야 한다.
		student[0] = new Student(20406, "윤지상", "12341234", "서울시 성북구 돈암동 정릉로 52길 42");
		student[1] = new Student();
		student[1].setSno(20403);
		student[1].setName("이정우");
		student[1].setTel("456789");
		student[1].setAddress("서울역 살아요");
		
		// 객체 배열 복사하기
		Student[] student1 = new Student[5];
		// 크기가 작은 배열에 크기가 큰 배열을 복사하면
		// 주소값만 복사되므로 크기가 큰 배열 그대로 복사가 되고,
		// 사용은 인덱스만큼만 사용할 수 있다. ( 객체는 주소를 복사한다. )
		student1 = student;
		
		Student[] student2 = Arrays.copyOf(student, 1);
		
		System.out.println(student.length);
		System.out.println(student1.length);
		System.out.println(student2.length);
		
	}
}
