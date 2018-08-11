public class LinkedList<T> {

    SingleNode<T> head;

    public LinkedList() {
        head = null;
    }

    public void append(T data) {
        SingleNode<T> current;

        if (head == null) {
            head = new SingleNode<>(data);
            return;
        }

        current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new SingleNode<>(data);
    }

    public void prepend(T data) {
        if (head == null) {
            head = new SingleNode<>(data);
        }

        SingleNode<T> newHead = new SingleNode<>(data);
        newHead.next = head;

        head = newHead;
    }

    public boolean deleteWithData(T data) {

        if (head == null)
            return false;

        if (head.data == data) {
            head = head.next;
            return true;
        }

        SingleNode<T> current = head;

        while (current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
            }

            current = current.next;
        }

        return false;
    }

    public boolean deleteWithIndex(int index) {
        if (head == null)
            return false;

        if (index == 0) {
            head = head.next;
            return true;
        }

        SingleNode<T> current = head;

        for (int i = 0; i < index - 1; ++i) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }
        current.next = current.next.next;

        return true;
    }

    public boolean contains(T data) {
        if (head == null)
            return false;

        SingleNode<T> current = head;

        while (current != null) {
            if (current.data == data)
                return true;

            current = current.next;
        }

        return false;
    }

    public void print() {
        if (head == null)
            System.out.println("Empty list");

        SingleNode<T> current = head;

        while (current != null) {
            System.out.print(String.valueOf(current.data) + ' ');
            current = current.next;
        }

        System.out.println(' ');
    }
}
