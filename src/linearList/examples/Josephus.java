package linearList.examples;

import linearList.SeqList;

public class Josephus {
    public static void main(String[] args) {
        new Josephus(5, 0, 2);
    }
    public Josephus(int number, int start, int distance) {
        System.out.println("Josephus(" + number + "," + start + "," + distance + ")");
        SeqList<String> list = new SeqList<>(number);
        for (int i = 0; i < number; i++)
            list.insert((char)('A' + i) + "");
        System.out.println(list.toString());
        int i = start;
        while (list.size() > 1) {
            i = (i + distance - 1) % list.size();
            System.out.println("删除" + list.remove(i) + ", ");
            System.out.println(list.toString());
        }
        System.out.println("被赦免: " + list.get(0));
    }
}
