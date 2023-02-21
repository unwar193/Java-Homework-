import java.net.SocketPermission;
import java.util.LinkedList;
import java.util.Random;

// Создать очередь с помощью LinkedList и реализовать следующие методы:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Вызвать полученные методы и убедиться в их работоспособности.

public class task42 {
    public static void main(String[] args) {
        LinkedList<Integer> initQueue = new LinkedList<>();        
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            initQueue.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Исходная очередь: " + initQueue);
        enqueue(initQueue);
        dequeue(initQueue);
        first(initQueue);
    }

    public static void enqueue(LinkedList<Integer> initQueue) {
        initQueue.add(0);
        System.out.println("Элемент '0' добвален в конец очереди: " + initQueue);
    }

    public static void dequeue(LinkedList<Integer> initQueue) {
        int firstEltoDel = initQueue.getFirst();
        initQueue.removeFirst();
        System.out.println("Первый элемент очереди: " + firstEltoDel + " удалён из очереди: " + initQueue);
    }

    public static void first (LinkedList<Integer> initQueue) {
        int firstEl = initQueue.getFirst();
        System.out.println("Первый элемент очереди: " + firstEl + " без удаления из очереди: " + initQueue);
    }
}
