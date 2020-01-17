package sortedSeqList;

import linearList.SeqList;

public class SortedSeqList<T extends Comparable<? super T>> extends SeqList<T> {
    // 构造函数
    public SortedSeqList() {
        super();
    }
    public SortedSeqList(int length) {
        super(length);
    }
    public SortedSeqList(T[] values) {
        super(values.length);
        for (int i = 0; i < values.length; i++)
            this.insert(values[i]);
    }
    public SortedSeqList(SeqList values) {
        super(values.size());
        for (int i = 0; i < values.size(); i++)
            this.insert((T)values.get(i));
    }
    // 插入方法
    public int insert(T x) {
        int i = 0;
        if (this.isEmpty() || x.compareTo(this.get(this.size() - 1)) > 0)
            i = this.n;
        else
            while (i < this.n && x.compareTo(this.get(i)) > 0)
                i++;
        super.insert(i, x);
        return i;
    }
    // 覆盖不支持的方法
    public void set(int i, T x) {
        throw new UnsupportedOperationException("set(..)");
    }
    public int insert(int i, T x) {
        throw new UnsupportedOperationException("insert(..)");
    }
}
