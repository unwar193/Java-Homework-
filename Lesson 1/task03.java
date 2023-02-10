import java.util.Scanner;

// Реализовать простой калькулятор (операции + - / * )
// Пример работы программы:
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: +
// Ответ: 5
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: а
// Ответ: Такой операции нет
public class task03 {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner sn1 = new Scanner(System.in);
        double num1 = sn1.nextInt();

        System.out.println("Введите операцию ");
        Scanner soperation = new Scanner(System.in);
        char operation = soperation.next().charAt(0);

        System.out.println("Введите второе число ");
        Scanner sn2 = new Scanner(System.in);
        double num2 = sn2.nextInt();
        if (operation == '+') {
            System.out.println("Результат сложения " + num1 + " и " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Результат вычитания " + num1 + " и " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("Результат умножения " + num1 + " на " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println("Результат деления " + num1 + " на " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Вы ввели неверную операцию!");
        }
        sn1.close();
        sn2.close();
        soperation.close();

    }
}
