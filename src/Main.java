import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};

        System.out.println("Введите целое число");
        int arrTwo = scanner.nextInt();

        functionSearch(arr, arrTwo);
    }

    public static void functionSearch(int[] arr, int arrTwo) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (arr[middle] > arrTwo) {
                right = middle - 1;
            } else if (arr[middle] < arrTwo) {
                left = middle + 1;
            }
            if (arr[right] > arrTwo || arr[left] > arrTwo) {
                System.out.println(" только" + ((arrTwo > 32) ? " 2" : " 3") +
                        " книги на полке строго больше чем " + arrTwo + " страницы");
            }
            return;
        }
    }
}