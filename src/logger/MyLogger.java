package logger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	// logger는 시스템 운영에 대한 기록을 남기는 객체
	// 디버깅, 시스템 에러 추적, 성능, 문제점 향상을 위해서 사용
	// 오픈소스로 log4j를 많이 사용하고 있음.
	// logging페이지에서 제공하는 로그 레벨은 severe, warning, info, config, fine, finer,
	// finest(앞에서부터 심각성순)

	// 식별자 향상 같은 인스턴스가 반환됨
	// 식별자에 해당하는 아이를 매핑해서 사용하면 됨.
	// 외부에서 new할 수 없다.(singleton 패턴)

	// logger이름은 화면 단위 시스템 대로 보통 이름을 정함.
	Logger logger = Logger.getLogger("myLogger");
	private static MyLogger instance = new MyLogger();

	// 어디에 저장할지 상수로 만들어서 사용
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";

	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;

	private MyLogger() {
		try {
			logFile = new FileHandler(errorLog, true);
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());

		logFile.setLevel(Level.ALL);
		warningFile.setLevel(Level.WARNING);
		fineFile.setLevel(Level.FINE);

		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);

	}

	public static MyLogger getLogger() {
		return instance;
	}

	public void log(String msg) {
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
	}

	public void fine(String msg) {
		logger.fine(msg);
	}

	public void warning(String msg) {
		logger.warning(msg);
	}
}