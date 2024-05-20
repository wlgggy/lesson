package Design.Observer;

public class IButton {
	private String name;
	private IButtonClickListener buttonClickListener;

	public IButton(String buttonName) {
		// TODO Auto-generated constructor stub
		this.name = buttonName;
	}

	public void click(String clickEvent) {
		buttonClickListener.click(this.name + clickEvent);
	}

	public void addListener(IButtonClickListener buttonClickListener) {
		this.buttonClickListener = buttonClickListener;
	}
}
