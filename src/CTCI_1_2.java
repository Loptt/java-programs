import java.util.Arrays;
import java.util.Scanner;

public class CTCI_1_2 {

    static boolean isPermutation(String originalString, String permutator) {

        char[] arrOriginalString = originalString.toCharArray();
        char[] arrPermutator = permutator.toCharArray();

        Arrays.sort(arrOriginalString);
        Arrays.sort(arrPermutator);

        for (int i = 0; i < arrPermutator.length; ++i) {
            if (arrPermutator[i] != arrOriginalString[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String original = reader.next();
        String permutator = reader.next();

        if (isPermutation(original, permutator)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
