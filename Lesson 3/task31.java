import java.util.ArrayList;
import java.util.Random;

//Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

public class task31 {    
    public static void main(String[] args) {    
        ArrayList<Integer> num_arr = new ArrayList<>(); 
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            num_arr.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Исходный массив: " + num_arr);
        for (int i = 0; i < num_arr.size(); i++) {
            if (num_arr.get(i) % 2 == 0) {
                num_arr.remove(i);
                i--;
            }
        }
        System.out.println("Массив нечетных чисел: " + num_arr);
    }
}