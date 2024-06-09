package May24;

public class FindLocation {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        findMinMax(numbers);
    }

    public static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("배열이 비어 있습니다.");
            return;
        }

        int minValue = arr[0], maxValue = arr[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            } else if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("최솟값: " + minValue + ", 최솟값의 인덱스: " + minIndex);
        System.out.println("최댓값: " + maxValue + ", 최댓값의 인덱스: " + maxIndex);
    }
}
