package InnerClass;

// Inner Class
// 내부 클래스는 클래스 안에서내부적으로 사용할 클래스를 선언함 
// 외부 클래스가 생성된 이후에 내부 클래스가 생성된다.
// 내부클래스에 static이 있으면 내부클래스보다 Static이 먼저 생성되어야 해서
// jdk 16이전에는 오류가 발생하였으나 그 이후 버전에서는 완화되어 오류가 생기지는 않지만
// static을 사용하려면 static으로 클래스를 정의하는것을 권장한다.
// http://bugs.openjdk.org/browse/JDK-8254321

// 내부 클래스 종류에는
// 인스턴트 내부클래스, 정적 내부클래스, 
class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	class InClass {
		int Num = 10;
		static int isNum = 200;

		void test() {
			// num은 outClass에 있는 변수이므로 접근 가능하다.
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(isNum);
		}
	}

	public void unsignedInner() {
		inClass.test();
	}

	static class InStaticClass {
		int num = 100;
		// static은 실행하면 맨처음 모두 static영역에 변수를 생성하는데 outclass에도 isNum이 있고
		// inStaticClass에도 isNum이 있어서 한 static 공간에 같은 이름의 두개의 변수를 만들 수 없기 때문에 오
		static int isNum = 200;

		void insTest() {
			System.out.println(num);
			System.out.println(isNum);

		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutClass outClass = new OutClass();
		outClass.unsignedInner();

		// innerClass로 생성하더라도 OutClass에서 선언한 변수들을 접근 가능하다.
		OutClass.InClass myClass = outClass.new InClass();
		myClass.test();

		OutClass.InStaticClass myInsClass = new OutClass.InStaticClass();
		myInsClass.insTest();
	}

}
