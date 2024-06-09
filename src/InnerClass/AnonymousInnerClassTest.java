package InnerClass;

//같은 패키지에 동일한 클래스를 만들 수 없다 라는 것은 이너 클래스도 동일하다.
class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(i);
				System.out.println(num);
				System.out.println(outNum);
				System.out.println(sNum);
			}
			
		};
	}
	
	// 단 하나의 인터페이스이거나 추상클래스인 경우에는 익명 이너 클래스를 사용할 수 있다.
	
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("test");
			
		}
		
	};
}
public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
		Runnable runner = outer.runner;
		runner.run();
		
	}

}
