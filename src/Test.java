public class Test {
   public static void main(String[] args) {

        HashTable<Integer, String> table = new HashTable<>();

        table.put(2, "Mec");

        System.out.println(table.get(2));
   }
}
