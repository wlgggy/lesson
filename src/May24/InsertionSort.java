package May24;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {50, 80, 70, 10, 60, 20, 40, 30};
        
        insertionSort(numbers);
        
        // 정렬된 배열 출력
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // key보다 큰 요소들을 오른쪽으로 한 칸씩 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // key를 올바른 위치에 삽입
            arr[j + 1] = key;
        }
    }
}
