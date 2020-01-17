package sortedSeqList.examples;

import linearList.SeqList;
import sortedSeqList.SortedSeqList;

public class Test {
    public static void main(String[] args) {
        SeqList<Integer> list1 = new SeqList<>(new Integer[]{70, 20, 80, 30, 60});
        SortedSeqList<Integer> slist1 = new SortedSeqList<>(list1);
        list1.insert(0, 10);
        list1.insert(50);
        slist1.insert(50);
        System.out.println("list1 = " + list1);
        System.out.println("slist1 = " + slist1);
        slist1.insert(0, 90);
    }
}
