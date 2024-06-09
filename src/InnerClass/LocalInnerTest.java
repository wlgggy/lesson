package InnerClass;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {
		int num = 100;
		
		// 메소드 안에 innerClass 만들
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				// 지역변수 num은 이렇게 만드는 경우에 상수가 되어서 변경이 불가능하다.
				// num += 10;
				// 매개변수 i와 num사용하기
				// call by value로 넘어온 지역변수 i도 변경이 불가능하다.
				// 지역변수 num과 i는 메서드가 끝나면 사용할 수 없으나
				// Runnable은 반환된 이후에도 사용가능하기 때문에 java에서 사용할 수 없도록 만들어 놈.
				// i = num;
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(sNum);
			}

		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		runnable.run();
		
	}

}
