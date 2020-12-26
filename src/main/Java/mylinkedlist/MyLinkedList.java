package mylinkedlist;

public interface MyLinkedList {
    public void add(int value);
    public void add(int position, int value);
    public int get(int position);
    public void remove(int position);
    public int size();
}
