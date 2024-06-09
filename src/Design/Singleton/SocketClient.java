package Design.Singleton;

public class SocketClient {

	// Singleton 패턴은 자기자신을 객체로 갖고 있다.
	private static SocketClient socketClient = null;

	// 다른 객체에서는 생성을 할 수 없도록 만들어야 한다.
	// 그래서 public 대신 private으로 접근제어자를 써야 한다.
	private SocketClient() {

	}

	// 기본 생성자를 다른 객체에서 사용할수 없기 때문에 여기에서 생성하는 메소드를 가져야 한다.
	// 인스턴스를 생성하는 메소드는 누구나 사용가능하게 하기 위해서 static으로 만들어야 한다.
	public static SocketClient getInstance() {
		// 멤버변수인 socketCLient를 생성하게 한다.
		if (socketClient == null)
			socketClient = new SocketClient();

		return socketClient;
	}
}
