import java.util.ArrayList;
import java.util.Random;

//Создать список целых чисел (заполнить случайными числами).
//Найти минимальное, максимальное и среднее из этого списка.

public class task32 {
    public static void main(String[] args) {
        ArrayList<Integer> num_arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            num_arr.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Исходный массив: " + num_arr);

        int max = num_arr.get(0);
        int min = num_arr.get(0);
        double avg = num_arr.get(0);

        // В цикле начинаем с первой ячейки
        for (int i = 1; i < num_arr.size(); i++) {
            if (num_arr.get(i) > max) {
                max = num_arr.get(i);
            }
        }

        System.out.println("Максимальное значение: " + max); 

        for (int i = 1; i < num_arr.size(); i++) {
            if (num_arr.get(i) < min) {
                min = num_arr.get(i);
            }
        }

        System.out.println("Минимальное значение: " + min);

        double sumOfInt = num_arr.get(0);
        for (int i = 1; i < num_arr.size(); i++) {
            
            sumOfInt = sumOfInt + num_arr.get(i);
        }
        avg = sumOfInt/num_arr.size();
        System.out.println("Среднее значение: " + avg);
    }
}
