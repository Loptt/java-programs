import java.util.Arrays;
import java.util.Scanner;

public class CTCI_1_3 {

    static char[] slide2Array(char[] arrString, int position) {

        for (int i = arrString.length - 3; i >= position; --i) {
            arrString[i+2] = arrString[i];
        }

        return arrString;
    }

    static char[] insertChars(char[] arrString, int position) {

        arrString[position] = '%';
        arrString = slide2Array(arrString, position);
        arrString[position + 1] = '2';
        arrString[position + 2] = '0';

        return arrString;
    }

    static String URLify(String string) {

        char[] arrString = string.toCharArray();

        for (int i = 0; i < arrString.length; ++i) {
            if (arrString[i] == ' ') {
                arrString = insertChars(arrString, i);
            }
        }

        string = Arrays.toString(arrString);

        return string;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();

        System.out.println(URLify(input));
    }
}
