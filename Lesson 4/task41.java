import java.util.LinkedList;
import java.util.Random;

//Создать LinkedList целых чисел (заполнить случайными числами).
//Реализуйте метод, который вернет “перевернутый” список.

public class task41 {
    public static void main(String[] args) {
        LinkedList<Integer> myArray = new LinkedList<>();        
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myArray.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Исходный массив: " + myArray);
        reversing(myArray);
    }
    public static void reversing(LinkedList<Integer> Array) {
        LinkedList<Integer> revArray = new LinkedList<>();
        while (Array.size() > 0) {
            revArray.add(Array.peekLast());
            Array.removeLast();
        }
        System.out.println("Перевёрнутый массив: " + revArray);
    }
}
