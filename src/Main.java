import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int sum = 0;
        for (int element: arr ){
            sum += element;
        }
        System.out.println("Сумма затрат за месяц равна " + sum + " рублей.");
        System.out.println();

        System.out.println("Задание 2");
        int maxSpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr [i];
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
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =reverseFullName.length -1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
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


}