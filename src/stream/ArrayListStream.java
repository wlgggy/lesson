package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class CompareName implements BinaryOperator<String> {

	@Override
	public String apply(String t, String u) {
		// TODO Auto-generated method stub
		if (t.length() > u.length())
			return u;
		else
			return t;
	}

}

public class ArrayListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList = new ArrayList<String>();

		sList.add("messi");
		sList.add("ronaldo");
		sList.add("Sonny");
		sList.add("Ferdinand");

		// 스트림 이용한 출력
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));

		sList.stream().forEach(s -> System.out.println(s));

		System.out.println();

		// 정렬하기
		sList.stream().sorted().forEach(s -> System.out.println(s));

		System.out.println();

		// 글자수가 5보다 작은 아이들만 출력하기
		sList.stream().filter(s -> s.length() <= 5).forEach(s -> System.out.println(s));

		// 갯수세어보기
		System.out.println(sList.stream().count());

		// 글자수가 5인 아이들은 몇개가 있는지 세어보기
		System.out.println(sList.stream().filter(s -> s.length() <= 5).count());

		// list를 스트링 배열로 만들기
		String[] sArray = new String[4];

		for (int i = 0; i < sList.size(); i++)
			sArray[i] = sList.get(i);

		String s;
		s = Arrays.stream(sArray).reduce(new CompareName()).get();

		System.out.println(s);
	}

}
