package singlyList;

public class SinglyList<Ts> {
    // 创建内部类，封装Node
    private class Node<T> {
        public T data;
        public Node<T> next;
        // 内部类Node初始化函数
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
        // 无参构造函数
        public Node() {
            this(null, null);
        }
        public String toString() {
            return this.data.toString();
        }
    }
    // 代表头结点
    public Node<Ts> head;
    // 无参初始化函数
    public SinglyList() {
        this.head = new Node<>();
    }
    // 以Ts类型的数组泛型构造链表
    public SinglyList(Ts[] values) {
        // 调用空参初始化
        this();
        // rear暂存头结点
        Node<Ts> rear = this.head;
        for (int i = 0; i < values.length; i++) {
            rear.next = new Node<Ts>(values[i], null);
            rear = rear.next;
        }
    }
    // 判断是否为空
    public boolean isEmpty() {
        // 假设头结点没有下一个结点的话判断为空
        return this.head.next == null;
    }
    // 取操作
    public Ts get(int i) {
        // head不是真正的头结点，只是用来指向单链表的头结点，p才是真正的头结点
        Node<Ts> p = this.head.next;
        for (int j = 0; p != null && j < i; j++)
            p = p.next;
        return (i >= 0 && p != null) ? p.data : null;
    }
    public void set(int i, Ts x) {
        // TODO: 暂时不写
    }
}
