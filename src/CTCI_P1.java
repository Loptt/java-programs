import java.util.HashMap;
import java.util.Scanner;

public class CTCI_P1 {

    static boolean checkIfUnique(String string) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < string.length(); ++i) {
            if (map.get(string.charAt(i)) != null) {
                return false;
            }
            map.put(string.charAt(i), string.charAt(i));
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String input = reader.next();

        if (checkIfUnique(input)) {
            System.out.println("Unique");
        }
        else {
            System.out.println("Repeated");
        }
    }
}
