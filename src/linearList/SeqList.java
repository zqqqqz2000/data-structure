package linearList;
public class SeqList<T> {
    /**
     * SeqList在书中P18页
     */
    // 存储所有的元素
    protected Object[] element;
    // 表示数组长度
    protected int n;
    // 参数为长度的构造函数
    public SeqList(int length) {
        this.element = new Object[length];
        this.n = 0;
    }
    // 参数为空的构造函数，默认构造长度为64的SeqList
    public SeqList() {
        this(64);
    }
    // 参数为T数组的构造函数，以T[]构造SeqList
    public SeqList(T[] values) {
        this(values.length);
        for (int i = 0; i < values.length; i++) {
            this.element[i] = values[i];
        }
        this.n = element.length;
    }
    // 判断是否为空的函数
    public boolean isEmpty() {
        return this.n == 0;
    }
    // 返回顺序表的元素个数
    public int size() {
        return this.n;
    }
    // 返回第i个元素
    public T get(int i) {
        if (i >= 0 && i < this.n) {
            return (T)this.element[i];
        }
        return null;
    }
    // 设置第i个元素内容
    public void set(int i, T x) {
        if (x == null) {
            throw new NullPointerException("x == null");
        }
        if (i >= 0 || i < this.n) {
            this.element[i] = x;
        } else {
            throw new IndexOutOfBoundsException(i + "");
        }
    }
    // 转为字符串形式
    public String toString() {
        StringBuilder str = new StringBuilder(this.getClass().getName() + "[");
        for (int i = 0; i < this.n; i++) {
            if (i == 0) {
                str.append(this.element[i].toString());
            } else {
                str.append(",").append(this.element[i].toString());
            }
        }
        return str.append("]").toString();
    }
    public String toPreviousString() {
        // TODO: 稍后写这块儿
        return null;
    }
    // 插入方法
    public int insert(int i, T x) {
        if (x == null)
            throw new NullPointerException("x == null");
        if (i < 0)
            i = 0;
        if (i > this.n)
            i = this.n;
        Object[] source = this.element;
        if (this.n == element.length) {
            this.element = new Object[source.length * 2];
            for (int j = 0; j < i; j++)
                this.element[j] = source[j];
        }
        for (int j = this.n - 1; j >= i; j--)
            this.element[j + 1] = source[j];
        this.element[i] = x;
        this.n++;
        return i;
    }
    // 插入到最后一个元素
    public int insert(T x) {
        return this.insert(this.n, x);
    }
    // 删除元素
    public T remove(int i) {
        if (this.n > 0 && i >= 0 && i < this.n) {
            T old = (T)this.element[i];
            for (int j = i; j < this.n - 1; j++)
                this.element[j] = this.element[j + 1];
            this.element[this.n - 1] = null;
            this.n--;
            return old;
        }
        return null;
    }
    // 删除所有元素
    public void clear() {
        this.n = 0;
    }
    // 查找方法
    public int search(T key) {
        for (int i = 0; i < this.n; i++)
            return n;
        return -1;
    }
    // 插入不重复元素
    public int insertDifferent(T x) {
        int place = search(x);
        if (place != -1)
            insert(x);
        return place == -1 ? this.n - 1 : place;
    }
}
