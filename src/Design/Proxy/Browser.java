package Design.Proxy;

public class Browser implements IBrowser {
	private HTML html;
	private String url;

	public Browser(String url) {
		// TODO Auto-generated constructor stub
		this.url = url;
	}

	@Override
	public HTML show() {
		// TODO Auto-generated method stub
		System.out.println("browser loading " + url);
		return new HTML(url);
	}

}
