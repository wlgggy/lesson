package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };

		// 배열 출력하기
		for (int c : a)
			System.out.println(c);
		// 스트림은 배열이나 콜렉션에서 사용
		Arrays.stream(a).forEach(s -> System.out.println(s));

		// 스트림을 이용해서 합계 구하기
		int total = Arrays.stream(a).sum();
		System.out.println(total);

		// 정수형 스트림 만들기
		// 스트림은 한번 사용하면 사라진다.
		IntStream is = Arrays.stream(a);

		// 정수형 스트림을 만들어 합계 구하기
		System.out.println(is.sum());

		// 소모된 스트림은 코딩할때 소모여부를 알 수가 없다.
		// 문법적 오류는 없으나 실행할때 예외가 발생한다.
		System.out.println(is.sum());

		// 스트림은 중간연산자와 최종연산자가 있다.
		total = Arrays.stream(a).filter(c -> c % 2 == 0).sum();
	}

}
