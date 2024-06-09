package Abstract;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Desktop();
		computer.turnOn();
		computer.display();
		computer.typing();
		computer.turnOff();

		System.out.println();

		Notebook notebook = new MyNotebook();
		notebook.changeBattery();
		notebook.turnOn();
		notebook.display();
		notebook.typing();
		notebook.turnOff();
	}

}