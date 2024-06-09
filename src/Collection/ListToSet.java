package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

//List와 set은 모두 Collection에 들어 있다.
public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List를 만들기
		List<String> list = new ArrayList<String>();
		list.add("김영호");
		list.add("김지효");
		list.add("박민규");
		list.add("신권호");
		list.add("김지효");
		list.add("박민규");
		list.add("신민석");
		list.add("김지효");
		list.add("박민규");
		list.add("윤지상");
		list.add("김지효");
		list.add("박민규");

		// 스트링처럼 특별한 객체로 출력하면 list형태로 주소가 아니라 데이터가 바로 출력된다.
		System.out.println(list);

		// list의 데이터를 순회하기
		ListIterator<String> li = list.listIterator();

		// 순차적으로 순회하기
		System.out.println("순차적 순회");
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// 역방향으로 순회하기
		System.out.println("역방향 순회");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		// 리스트와 set의 차이점? set은 중복할 수 없다.
		HashSet<String> hSet = new HashSet<>();
		hSet.addAll(list);
		System.out.println("해쉬셋 출력");
		System.out.println(hSet);

		// hashSet은 정렬되지 않고 TreeSet은 정렬을 한다.
		TreeSet<String> tSet = new TreeSet<>();
		tSet.addAll(list);
		System.out.println("트리셋 출력");
		System.out.println(tSet);
	}

}
