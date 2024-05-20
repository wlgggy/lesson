package Lamda;

// java 8에서 부터 함수형 프로그램을 지원하기 시작함
// 함수의 구현과 수행으로 프로그램이 구성되어 이쓴ㄴ 것이 함수형 프로그램이다.

// 형식
// (매개변수 들)->(명령문 들)
// 매개변수가 하나만 있는 경우
// 괄호 없이, 매개변수 -> (명령문 들) 
// 실행문이 한개인 경우
// (매개변수 들) -> 명령문
// 실행문이 return 문만 있는 경우 return을 생략 가능하다.
// (매개변수 들) -> 값
public class AddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Add add = (a,b) -> return a+b;
		Add add = (a, b) -> a + b;

		System.out.println(add.add(10, 20));

		MyPrint myP = (s) -> System.out.println(s);

		myP.myPrint("함수형 프로그램으로 출력");

		String s1 = "용산구";
		String s2 = "회나무로12길";

		// 객체지향 프로그래밍
		StringConcatImpl sci = new StringConcatImpl();
		sci.makeString(s1, s2);

		// 람다식 프로그램
		StringConcat sc = (s, v) -> System.out.println(s + " " + v);
		sc.makeString(s1, s2);

		System.out.println();

		// 메인에서 바로 구현
		StringConcat sc2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1 + " " + s2);
			}
		};
		sc2.makeString(s1, s2);
	}

}
