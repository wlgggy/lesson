package thread;

// Thread 우선순위
// Thread.Min_priority(=1),
// Thread.Max_priority(=10),
// 우선순위는 1부터 10까지 있다.
// 우선순위가 높다라는 뜻은 CPU를 오래 차지할 가능성이 높다.
// setPriority로 우선순위를 변경할 수 있다.

class PriorityThread extends Thread {
	public void run() {
		int sum = 0;
		// 현재 쓰레드 가져오기
		Thread t = Thread.currentThread();

		System.out.println(t + " start");
		for (int i = 1; i <= 100000; i++)
			sum += i;
		System.out.println(t + "'s sum is " + sum);
		System.out.println(t + " ended ");
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		int i;
		for (i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();
		}
	}
}
