package May24;

public class BinarySearch {
	// BinarySearch ‘정렬된 배열’에서 ‘특정 값’을 찾는 알고리즘을 의미
	public static void main(String[] args) {
		// 12, 25, 31, 46, 54, 66, 80, 83, 95, 100
		int[] numbers = { 12, 25, 31, 46, 54, 66, 80, 83, 95, 100 }; // 배열을 만들어줍니다

		int target1 = 83;
		int target2 = 88;

		// number가 있는 위치를 찾습니다
		int index1 = binarySearch(numbers, target1);
		int index2 = binarySearch(numbers, target2);

		if (index1 != -1) { // 인덱스가 -1이 아닐 때
			System.out.println(index1);
		} else {
			System.out.println("배열에 존재하지 않습니다.");
		}

		if (index2 != -1) {
			System.out.println(index2);
		} else {
			System.out.println("배열에 존재하지 않습니다.");
		}

	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0; // 왼쪽 끝 인덱스는 0입니다
		int right = arr.length - 1; // 오른쪽 끝 인덱스는 배열 길이 - 1입니다

		while (left <= right) { // 왼쪽이 오른쪽보다 작거나 같을 때까지 반복합니다
			int mid = (left + right) / 2; // 중간 인덱스를 계산합니다

			if (arr[mid] == target) { // 중간 값이 찾고자 하는 값이면 인덱스를 반환합니다
				return mid; // 요소를 찾으면 인덱스 반환
			} else if (arr[mid] < target) {
				left = mid + 1; // 중간 값이 찾고자 하는 값보다 작으면 왼쪽 범위를 좁힙니다
			} else { // 중간 값이 찾고자 하는 값보다 크면 오른쪽 범위를 좁힙니다
				right = mid - 1; // 왼쪽 절반 검색
			}
		}

		return -1; // 요소를 찾지 못하면 -1 반환
	}
}
