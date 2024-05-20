package Design.Facade;

public class FileWriter {
	public FileWriter(String fileName) {
		// TODO Auto-generated constructor stub
	}

	public void FileConnector() {
		System.out.println("FileWriter is connected!!");
	}

	public void fileWriter(String content) {
		System.out.println("write : " + content);
	}

	public void FileDisconnector() {
		System.out.println("FileWriter is disconnected!!");
	}
}
