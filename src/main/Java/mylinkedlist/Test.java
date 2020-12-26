package mylinkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedListImpl();
        list.add(1000);
        list.add(0,10);
        list.add(35);
        list.add(20);
        list.add(500);
        list.add(0,50);
        list.add(100);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i"+i+"-"+list.get(i));
        }
        list.remove(7);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i"+i+"-"+list.get(i));
        }

    }



}
