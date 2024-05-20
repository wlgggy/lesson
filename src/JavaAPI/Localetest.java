package JavaAPI;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Localetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Locale
		// java가 다국어를 사용할 수 있도록 해주는 클래스
		// Locale은 다국어를 사용할 수 있도록 ISO 언어코드를 사용한다.
		// ISO 언어 코드는 소문자 2개로 이루어져 있다.
		// 한국은 ko, 영어는 us, 일본어 jp

		// DataFormat에서 제공하는 모든 로케일을 리스트에 담기
		Locale[] list = DateFormat.getAvailableLocales();

		ArrayList<String> arrLocale = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {
			arrLocale.add(list[i].toString());

			// ArrayList는 간단하게 정렬할 수 있다.
			Collections.sort(arrLocale);

			for (String s : arrLocale) {
				System.out.println(s);
			}

			// Locale의 정보를 함께 출력하기
			Locale locale = null;
			for (String s : arrLocale) {
				if (s.indexOf("_") > -1) {
					String[] arrData = s.split("_");
					locale = new Locale(arrData[0], arrData[1]);
				} else {
					locale = new Locale(s);

					System.out.println(
							locale.toString() + " " + locale.getDisplayCountry() + " " + locale.getDisplayLanguage());

				}

			}

		}
	}

}
