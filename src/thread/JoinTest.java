package thread;

public class JoinTest extends Thread {

	int start;
	int end;
	int total;

	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {
		int i;
		for (i = start; i <= end; i++)
			total += i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinTest jt1 = new JoinTest(1, 1000);
		JoinTest jt2 = new JoinTest(1001, 2000);
		JoinTest jt3 = new JoinTest(2001, 3000);
		JoinTest jt4 = new JoinTest(3001, 4000);
		JoinTest jt5 = new JoinTest(4001, 5000);
		JoinTest jt6 = new JoinTest(5001, 6000);
		JoinTest jt7 = new JoinTest(6001, 7000);
		JoinTest jt8 = new JoinTest(7001, 8000);
		JoinTest jt9 = new JoinTest(8001, 9000);
		JoinTest jt10 = new JoinTest(9001, 10000);

		jt1.start();
		jt2.start();
		jt3.start();
		jt4.start();
		jt5.start();
		jt6.start();
		jt7.start();
		jt8.start();
		jt9.start();
		jt10.start();

		try {
			jt1.join();
			jt2.join();
			jt3.join();
			jt4.join();
			jt5.join();
			jt6.join();
			jt7.join();
			jt8.join();
			jt9.join();
			jt10.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		int joinTotal = jt1.total + jt2.total + jt3.total + jt4.total + jt5.total + jt6.total + jt7.total + jt8.total
				+ jt9.total + jt10.total;
		System.out.println(jt1.total);
		System.out.println(jt2.total);
		System.out.println(jt3.total);
		System.out.println(jt4.total);
		System.out.println(jt5.total);
		System.out.println(jt6.total);
		System.out.println(jt7.total);
		System.out.println(jt8.total);
		System.out.println(jt9.total);
		System.out.println(jt10.total);

		System.out.println(joinTotal);
	}

}
