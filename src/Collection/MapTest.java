package Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(20401, "김영호");
		hMap.put(20402, "김지효");
		hMap.put(20403, "김지효");
		hMap.put(20404, "김지효");
		hMap.put(20405, "김지효");
		hMap.put(20406, "김지효");
		hMap.put(20407, "김지효");
		hMap.put(20408, "윤지상");

		System.out.println("해쉬맵 출력");
		System.out.println(hMap);

		TreeMap<Integer, String> tMap = new TreeMap<>();
		tMap.putAll(hMap);

		System.out.println("트리맵 출력");
		System.out.println(tMap);
	}

}
