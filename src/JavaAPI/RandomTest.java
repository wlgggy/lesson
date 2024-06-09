package JavaAPI;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextDouble());
		System.out.println(r.nextFloat());

		// 생성자에 같은 숫자 입력하기
		// 생성할때 같은 숫자를 집어 넣으면 같은 난수가 발생한다
		Random r2 = new Random(236);
		Random r3 = new Random(236);

		System.out.println();

		System.out.println("첫번째 객체");
		for (int i = 0; i < 10; i++) {
			System.out.println(r2.nextInt());
		}
		System.out.println("두번째 객체");
		for (int i = 0; i < 10; i++) {
			System.out.println(r3.nextInt());
		}
	}

}
