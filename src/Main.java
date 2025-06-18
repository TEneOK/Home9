import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("Task1");
        int[] payMonth = {5900, 9000, 15340, 12214, 5550};
        int sum = 0;
        for (int index : payMonth) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
//task2
        System.out.println("Task2");
        int[] payWeek = {1000, 2450, 92, 5321, 300};
        int minPay = 1_000_000;
        int maxPay = 1;
        for (int num : payWeek) {
            if (num < minPay) {
                minPay = num;
            }
            if (num > maxPay) {
                maxPay = num;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPay + " рублей.");
//task3
        System.out.println("Task3");
        int[] averageWeek = {32132, 52100, 40000, 11000, 53506};
        int averageSum = 0;
        for (int index : averageWeek) {
            sum += index;
        }
        double average = sum / (averageWeek.length);
        System.out.println(average);
//task4
        System.out.println("Task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int start = 0;
        int finish = reverseFullName.length - 1;

        while (start < finish) {
            char temp = reverseFullName[start];
            reverseFullName[start] = reverseFullName[finish];
            reverseFullName[finish] = temp;

            start++;
            finish--;
        }

        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}