public class HashTable<K,V>{

    private static final int SIZE = 100;

    private HashNode<K,V>[] nodeArray;

    @SuppressWarnings("unckecked")
    public HashTable() {
        nodeArray = new HashNode[SIZE];
    }

    public V put(K key, V value) {
        int hash = hashFunction(key);

        for (HashNode<K,V> node = nodeArray[hash]; node != null; node = node.next) {
            if (node.hash == hash && node.key.equals(key)) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
        }

        HashNode<K,V> node = new HashNode<>(key, value, hash, nodeArray[hash]);
        return null;
    }

    public V get(K key) {
        int hash = hashFunction(key);
        for (HashNode<K,V> node = nodeArray[hash]; node != null; node = node.next) {
            if (node.hash == hash && node.key.equals(key)) {
                return node.value;
            }
        }

        return null;

    }

    private int hashFunction(K key) {
        return key.hashCode() % SIZE;
    }

    private static class HashNode<K,V> {
        private final K key;
        private V value;
        private final int hash;
        private HashNode next;

        public HashNode(K key, V value, int hash, HashNode<K,V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }
}
