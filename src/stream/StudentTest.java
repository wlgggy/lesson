package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class moneyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		// 무엇을 비교할지 정확히 몰라서 Object로 비교할때 사용
		// Object를 매개변수로 받아옴
		// 반드시 강제 형변환을 해서 사용해야 함.
		int money1 = ((Student) o1).getMoney();
		int money2 = ((Student) o2).getMoney();

		// 리턴할때 첫번째 매개변수 - 두번째 매개변수의 값을 하면 오름차순
		// 두번째 매개변수 - 첫번째 매개변수 내림차순으로 정렬된다.
		return money1 - money2;
	}

}
//class CompareAge implements BinaryOperator<Integer> {
//
//	@Override
//	public Integer apply(Integer t, Integer u) {
//		// TODO Auto-generated method stub
//		if (t > u)
//			return u;
//		else
//			return t;
//	}
//
//}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student("김영호", 16, 10000);
		Student yoon = new Student("윤지상", 16, 20000);
		Student hong = new Student("홍의준", 17, 1500);

		List<Student> sList = new ArrayList<Student>();
		sList.add(hong);
		sList.add(yoon);
		sList.add(kim);

		// 학생의 이름 출력하기
		sList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// 용돈의 합계 출력하기
		System.out.println(sList.stream().mapToInt(c -> c.getMoney()).sum());

		// 16살인 학생 출력하기
		sList.stream().filter(c -> c.getAge() == 16).map(c -> c.getName()).forEach(s -> System.out.println(s));

		System.out.println();
		// 16살인 학생의 이름을 정렬하여 출력하기(이정규)
		sList.stream().filter(c -> c.getAge() == 16).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));

		System.out.println();

		// 학생의 나이순으로 이름 출력하기(이은상)
		Collections.sort(sList);
		sList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		System.out.println();

		// 학생 섞기
		Collections.shuffle(sList);
		sList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		System.out.println();
		// 다시정렬
		Collections.sort(sList, new moneyComparator());

		// 학생의 용돈으로 내림차순으로 이름 출력하기
		Collections.reverse(sList);
		sList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

	}

}