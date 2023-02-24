import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class function {
    static void AddPerson(HashMap<String, HashSet<String>> telBook) {
        HashSet<String> telPerson = new HashSet<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента >>> \n");
        String name = iScanner.nextLine().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        while (true) {
            System.out.printf("\nВведите номер телефона абонента\nДля выхода нажмите Enter >>>\n");
            String tel = iScanner.nextLine();
            if (tel == "") break;
            telPerson.add(tel);
        }
        telBook.put(name, telPerson);
    }

    static void DelPersone(HashMap<String, HashSet<String>> telBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента >>> \n");
        String name = iScanner.nextLine().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        if (!telBook.containsKey(name)) {
            System.out.println("Такого абонента нет в справочнике");
            return;
        }
        telBook.remove(name);
    }

    static void AddTelephone(HashMap<String, HashSet<String>> telBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента >>>\n");
        String name = iScanner.nextLine().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        if (!telBook.containsKey(name)) {
            System.out.println("Такого абонента нет в справочнике");
            return;
        }
        System.out.printf("Введите номер телефона абонента >>>\n");
        String tel = iScanner.nextLine();
        telBook.get(name).add(tel);
    }

    static void DelTelephone(HashMap<String, HashSet<String>> telBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента >>>\n");
        String name = iScanner.nextLine().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        if (!telBook.containsKey(name)) {
            System.out.println("Такого абонента нет в справочнике");
            return;
        }
        System.out.printf("Выберите порядковый номер телефона, который хотите удалить >>>\n");
        System.out.println(telBook.get(name));
        int number = iScanner.nextInt();
        int count = 1;
        for (var item : telBook.get("Ivan")) {
            if (count == number) telBook.get(name).remove(item);
            count++;
        }
    }

    static void FindTel(HashMap<String, HashSet<String>> telBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента >>>\n");
        String name = iScanner.nextLine().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        if (!telBook.containsKey(name)) {
            System.out.println("Такого абонента нет в справочнике");
            return;
        }
        System.out.println("Этот абонент использует телефоны:\n" + telBook.get(name));
    }

    static String Menu() {
        return "\n1 Добавить контакт\n" + 
        "2 Удалить контакт\n" + 
        "3 Добавить номер телефона к контакту\n" + 
        "4 Удалить номер телефона контакта\n" +
        "5 Показать номера телефонов контакта\n" +
        "6 Выйти\n" +
        "Выберите номер меню >>>\n";
    }
}
