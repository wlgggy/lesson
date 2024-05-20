package Design.Facade;

public class FileReader {

	public FileReader(String fileName) {
		// TODO Auto-generated constructor stub
	}

	public void FileConnector() {
		System.out.println("FileReader is connected!!");
	}

	public String fileRead() {
		return "content";
	}

	public void FileDisconnector() {
		System.out.println("FileReader is disconnected!!");
	}
}
