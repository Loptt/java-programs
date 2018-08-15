import java.util.Arrays;
import java.util.Scanner;

public class CTCI_1_4  {

    static boolean isBetterPalindrome(String string) {

        string = string.toLowerCase();

        char[] arrString = string.toCharArray();
        short[] values  = new short[128];

        int spaceAmount = 0;

        for (int i = 0; i < arrString.length; ++i) {
            values[arrString[i]] += 1;

            if (arrString[i] == 0x20) {
                ++spaceAmount;
            }
        }

        boolean isEven = (arrString.length - spaceAmount) % 2 == 0;
        boolean middleFound = false;

        for (int i = 0; i < values.length; ++i) {
            if (values[i] % 2 != 0 && i != 0x20) {
                if (!middleFound && !isEven) {
                    middleFound = true;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();

        if (isBetterPalindrome(string)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
