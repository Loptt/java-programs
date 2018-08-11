public class Test {
   public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.print();

        list.append(3);
        list.append(4);
        list.append(1);

        list.print();

        list.prepend(5);
        list.prepend(2);

        list.print();

        list.deleteWithData(4);

        list.print();

        System.out.println(list.deleteWithIndex(2));

        list.print();
   }
}
