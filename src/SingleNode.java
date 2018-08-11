public class SingleNode<T> {
    SingleNode<T> next;
    T data;

    public SingleNode(T data) {
        this.data = data;
        next = null;
    }
}
