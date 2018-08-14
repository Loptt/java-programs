import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CTCI_1_1 {

    static boolean checkIfUniqueSlow(String string) {

        char[] arrString = string.toCharArray();
        Arrays.sort(arrString);

        for (int i = 0; i < arrString.length - 1; ++i) {
            if (Arrays.binarySearch(arrString, i + 1, arrString.length - 1 ,arrString[i]) >= 0) {
                return false;
            }
        }

        return true;
    }

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

        if (checkIfUniqueSlow(input)) {
            System.out.println("Unique");
        }
        else {
            System.out.println("Repeated");
        }
    }
}
