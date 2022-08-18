import java.util.Arrays;
import java.util.Objects;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма затрат за месяц равна " + sum + " рублей.");
        System.out.println();

        System.out.println("Задание 2");
        int maxSpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");

        int minSpending = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        System.out.println();

        System.out.println("Задание 3");
        float mean = sum / arr.length;
        System.out.println("Средняя сумма трат за день составила " + mean + " рублей");
        System.out.println();

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 5");
        int size = 3;
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            twoDimArray[i][i] = 1;
            twoDimArray[i][size - 1 - i] = 1;
            twoDimArray[i][i] = 1;
        }
        for (int[] row : twoDimArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Задание 6");
        int[] days = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(days));
        int[] arr1 = Arrays.copyOf(days, days.length);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        // или
        int index = days.length;
        int [] array = new  int[index];
        for (int i = 0; i < days.length; i++) {
            index = days.length - 1 - i;
            array[index] = days[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Задание 7");
        int [] ball = {9 ,6, 4, 3, 7, 5};
        for (int i = 0; i < ball.length / 2; i++) {
            int temp = ball[i];
            ball[i] = ball[ball.length - i - 1];
            ball[ball.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(ball));
        System.out.println();

        System.out.println("Задание 8");
        int[] box = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i : box) {
            for (int m : box) {
                if (i + m == -2) {
                    System.out.println(i + ", " + m);
                } else {
                    break;
                }
            }
        }
        System.out.println("Задание 9");
        for (int i : box) {
            for (int m : box) {
                if (i + m == -2) {
                    System.out.println(i + ", " + m);
                }
            }
        }
    }



    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void bubbleSort(int[] arrs) {
        for (int i = arrs.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
        }

    }
}