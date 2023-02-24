import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class task51 {
    public static void main(String[] args) {
        HashMap<String, List<String>> Contacts = new HashMap<>();
        Contacts.put("Sam", List.of("89119119191", "89219212121"));
        Contacts.put("Sasha", List.of("89119119192"));
        Contacts.put("Olga", List.of("89119119193", "89219212123"));
        Contacts.put("John", List.of("89119119194", "89219212124"));
        System.out.println(Contacts.get("Иван Иванов"));
        menu(Contacts);
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static void allBook(HashMap<String, List<String>> AllBook)
    // Печать книги
    {
        for (var item : AllBook.entrySet()) {
            System.out.println("Имя: " + item.getKey() + "\nНомер" + item.getValue());
        }
    }
    
    public static HashMap<String, List<String>> add(HashMap<String, List<String>> book)
    // Добавление в тел. книгу
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        List<String> data = new ArrayList<>();
        while (true) {
            System.out.println("Если номеров больше нет, введите 'Q'");
            System.out.print("Введите номер: ");
            String nomer = scan();
            if (nomer.equals("Q")) {
                break;
            } else {
                data.add(nomer);
            }
        }
        book.put(name, data);

        return book;
    }

    public static void find(HashMap<String, List<String>> phoneBook)
    // Поиск абонента
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        System.out.println("Имя: " + name + "\nТелефон(ы): " + phoneBook.get(name));
    }

    public static HashMap<String, List<String>> menu(HashMap<String, List<String>> book) {
        while (true) {
            System.out.println("\nТелефонная Книга:\n" +
                    "\n1. Найти контакт \n2. Добавить контакт" +
                    " \n3. Печать телефонной книги \n4. Выход");
            System.out.print("\nвыберите пункт меню: ");
            String comands = scan();
            if (comands.equals("4")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        find(book);
                        break;
                    case "2":
                        add(book);
                        break;
                    case "3":
                        allBook(book);
                        break;
                    default:
                        break;
                }
            }
        }
        return book;
    }
}

