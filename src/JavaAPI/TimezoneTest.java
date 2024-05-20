package JavaAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone tz;
		Date date = new Date();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// Timezone은 그리니치천문대 기준으로 표준시를 사용
		tz = TimeZone.getTimeZone("Greenwich");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));

		// 우리나라 표준시
		tz = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));

		// 태평양 표준시
		tz = TimeZone.getTimeZone("America/Los_Angeles");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));

		// 평양 표준시
		tz = TimeZone.getTimeZone("Asia/Pyongyang");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));
	}

}
