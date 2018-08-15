import java.util.Arrays;
import java.util.Scanner;

public class CTCI_1_4  {

    static boolean isPalindrome(String string) {

        char[] arrString = string.toCharArray();
        Arrays.sort(arrString);

        for (int i = 0; i < arrString.length; ++i) {
            if (arrString[i] == ' ') {
                char[] shortArrString = Arrays.copyOfRange(arrString, 0, i-1);
            }
        }


        for (int i = 0; i < )

        return false;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String string;
    }
}
