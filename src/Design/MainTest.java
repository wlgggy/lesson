package Design;

import Design.Adapter.E220V;

import Design.Adapter.HairDryer;
import Design.Adapter.SocketAdapter;
import Design.Adapter.TV;
import Design.Decorator.DecoDeco;
import Design.Decorator.Decorator;
import Design.Decorator.IService;
import Design.Facade.FTPClient;
import Design.Observer.IButton;
import Design.Observer.IButtonClickListener;
import Design.Proxy.Browser;
import Design.Proxy.BrowserProxy;
import Design.Proxy.IBrowser;
import Design.Singleton.AClass;
import Design.Singleton.BClass;
import Design.Singleton.SocketClient;
import Design.Strategy.Base64Encoding;
import Design.Strategy.Encoder;
import Design.Strategy.NomalEncoding;

public class MainTest {
	public static void main(String[] args) {
		// Singleton 패턴
		// socket통신을 위해서 또는 bean 객체를 주고 받을 떄 등
		// 데이터를 공유하고자 할 때 사용한다.
//		AClass aclass = new AClass();
//		BClass bclass = new BClass();
//
//		SocketClient aClient = aclass.getSocketClient();
//		SocketClient bClient = bclass.getSocketClient();
//
//		System.out.println(aClient.equals(bClient));
//		System.out.println(aclass.equals(bclass));

		// Adapter 패턴
		// 비슷한 작업을 하는 경우 내부에서 다르게 동작하더라도
		// 외부에서 동일한 메소드 이름을 사용하도록 하는 패턴

//		HairDryer hairDryer = new HairDryer();//110v이고 connect로 on
//		TV myTV = new TV();//220v이고 powerOn으로 on
//		
//		hairDryer.connect();
//		myTV.powerOn();
//		
//		//Adapter를 사용해서 동일하게 구현하면
//		E220V adapterHairDryer = new SocketAdapter(hairDryer); //110V이지만 powerOn으로 On을 하기 위하여 Adapter 사용
//		
//		adapterHairDryer.powerOn();

		// Proxy Pattern
//		Browser browser = new Browser("www.naver.com");
//		browser.show();
//		browser.show();
//		
//		System.out.println();
//		
//		IBrowser browser2 = new BrowserProxy("www.naver.com");
//		browser2.show();
//		browser2.show();
//		browser2.show();

		// Decorator Pattern
//		IService service = new Decorator();
//		System.out.println(service.doSomething());
//		IService service2 = new DecoDeco();
//		System.out.println(service2.doSomething());

		// Observer Pattern
//		IButton myButton = new IButton("확인 버튼 ");
//		IButtonClickListener buttonClickListener = event -> System.out.println("click event " + event);
//		myButton.addListener(buttonClickListener);
//		
//		myButton.click("한번 클릭");
//		myButton.click("두번 클릭");
//		myButton.click("세번 클릭");

		// facade pattern
//		FTPClient client = new FTPClient("www.naver.com", "/home/content", "my book");
//		client.connect();
//		System.out.println(client.read());	
//		client.write("내용");	
//		client.disconnect();

		// Strategy Pattern
		Encoder base64Encoder = new Encoder();
		base64Encoder.setEncodingStrategy(new Base64Encoding());
		System.out.println(base64Encoder.getMessage("message"));

		Encoder normalEncoder = new Encoder();
		base64Encoder.setEncodingStrategy(new NomalEncoding());
		System.out.println(normalEncoder.getMessage("message"));

	}

}
