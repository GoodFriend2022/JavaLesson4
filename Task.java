import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        LinkedList<String> logins = new LinkedList<>();
        logins.add("Ivan");
        logins.add("Victor");
        logins.add("Alex");
        HashSet<String> ivan = new HashSet<>();
        ivan.add("89136477879");
        ivan.add("89055557662");
        HashSet<String> victor = new HashSet<>();
        victor.add("89056461221");
        victor.add("89516467721");
        HashSet<String> alex = new HashSet<>();
        alex.add("89041789293");
        alex.add("89456123634");
        alex.add("89234567889");
        HashMap<String, HashSet<String>> telBook = new HashMap<>();
        telBook.put(logins.get(0), ivan);
        telBook.put(logins.get(1), victor);
        telBook.put(logins.get(2), alex);

        
    }
}
