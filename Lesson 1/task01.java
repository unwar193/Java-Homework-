//Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
import java.util.Scanner;


public class task01 {
    public static void main(String[] args) {
        int sum = 0;
        int facN = 1;
        System.out.print("Введите число N: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        for (int i = 1; i <= n; i++) {
            facN = facN * i;
        }
        System.out.println("Сумма от 1 до N равна " + sum);
        System.out.println("Факториал числа N равен " + facN);
        num.close();
    }
}
