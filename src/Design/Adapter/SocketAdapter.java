package Design.Adapter;

public class SocketAdapter implements E220V {

	private E110V e110v;

	public SocketAdapter(E110V e110v) {
		this.e110v = e110v;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		e110v.connect();
	}

}
