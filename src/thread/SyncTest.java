package thread;

// Critical Section과 semaphore
// Critical section은 두개 이상의 thread가 동시에 하나의 자원에 접근할때 문제가 생길 수 있으므로 
// 동시에 접근할 수 없는 영역을 만드는데 그 영역을 Critical Section이라고 한다.

// semaphore는 특별한 형태의 시스템 객체이고, 
// semaphore를 가지고 thread critical section에 접근 가능하다.
// semaphore는 get과 release메소드로 조절한다.
// 한순간에는 오직 하나의 thread만이 semaphore를 얻을 수 있다.
// 나머지는 대기상태(block)상태로 들어간다.

// 동기화(Synchronization)
// 두개의 thread가 같은 객체에 접근할 경우 동시에 접근함으로 해서 생기는 오류가 발생할 수 있다.c
// 동기화는 임계영역에 접근한 경우 공유자원을 lock시켜서 다른 thread의 접근을 제한 한다.
// 동기화를 잘못 구현하면 deadlock에 빠진다.
// java에서는 synchronized 메서드나 synchronized 블럭을 사용할 수 있다.

class Bank {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void saveMoney(int money) {
		int m = getMoney();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m + money);

	}

	public void minusMoney(int money) {
		int m = getMoney();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m - money);
	}

}

class Bank2 {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int money) {
		int m = getMoney();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m + money);
	}

	public synchronized void minusMoney(int money) {
		int m = getMoney();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m - money);
	}

}

class Lee extends Thread {
	public void run() {
		System.out.println("lee started");
		SyncTest.myBank.minusMoney(3000);
		;
		SyncTest.myBank2.minusMoney(3000);
		System.out.println("minus 3000(myBank) :" + SyncTest.myBank.getMoney());
		System.out.println("minus 3000(myBank2) :" + SyncTest.myBank2.getMoney());
	}
}

class Kim extends Thread {
	public void run() {
		System.out.println("Kim started");
		SyncTest.myBank.saveMoney(3000);
		;
		SyncTest.myBank2.saveMoney(3000);
		System.out.println("save 3000(myBank) :" + SyncTest.myBank.getMoney());
		System.out.println("save 3000(myBank2) :" + SyncTest.myBank2.getMoney());
	}
}

public class SyncTest {
	public static Bank myBank = new Bank();
	public static Bank2 myBank2 = new Bank2();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lee lee = new Lee();
		lee.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		Kim kim = new Kim();
		kim.start();
	}

}
