package thread;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 100; i++)
			System.out.print(i + "\t");
	}

}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// currentThread를 출력하면
		// 어디에서 호출을 했는지, 우선순위, thread가 속한곳
		System.out.println(Thread.currentThread() + "started");

		MyThread2 runable = new MyThread2();

		// Thread를 생성할때 내가 만든 runable을 매개변수 인자로 만들어서 실행
		Thread th1 = new Thread(runable);
		Thread th2 = new Thread(runable);

		th1.start();
		th2.start();

		System.out.println(Thread.currentThread() + " ended");

		System.out.println();

		// 직접 runable을 생성해서 Thread를 만들고 실행할 수 있다.
		Runnable run = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
			}
		};

		run.run();
	}

}
