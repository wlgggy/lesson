package Design.Facade;

public class FTPClient {
	private FTProtocol ftProtocol;
	private FileWriter fileWriter;
	private FileReader fileReader;

	public FTPClient(String host, String path, String fileName) {
		this.ftProtocol = new FTProtocol(host, path);
		this.fileWriter = new FileWriter(fileName);
		this.fileReader = new FileReader(fileName);
	}

	public void connect() {
		this.ftProtocol.connect();
		this.fileReader.FileConnector();
		this.fileWriter.FileConnector();
	}

	public String read() {
		return this.fileReader.fileRead();
	}

	public void write(String content) {
		this.fileWriter.fileWriter(content);
	}

	public void disconnect() {
		this.fileWriter.FileDisconnector();
		this.fileReader.FileDisconnector();
		this.ftProtocol.disconnect();
	}
}
