package mylinkedlist;


import java.util.ArrayList;
import java.util.Objects;

public class MyLinkedListImpl implements MyLinkedList {
    private int size;

    private Nod head;
    private Nod nod;


    @Override
    public void add(int position, int value) {
        if (position>size){
            throw new IndexOutOfBoundsException("Index out of array");
        }
        if (position==0){
            head=new Nod(value,head);
            size++;
            return;
        }
        nod=head;
        for (int i = 1; i < position; i++) {
                nod = nod.getNextElement();
        }
        nod.setNextElement(new Nod(value,nod.getNextElement()));
        size++;
    }

    @Override
    public void add(int value) {
        this.add(size,value);

    }

    @Override
    public int get(int position) {
        if (position >=size){
            throw new IndexOutOfBoundsException("Index out of array");
        }
        else {
            nod = head;
            for (int i=0;i<position;i++){
                nod=nod.getNextElement();
            }
        }
        return nod.getValue();

    }

    @Override
    public void remove(int position) {
        if (position>=size){
            throw new IndexOutOfBoundsException("Index out of array");
        }
        if (position==0){
            head=head.getNextElement();
            size--;
            return;
        }
        nod=head;
        for (int i = 1; i < position; i++) {
            nod = nod.getNextElement();
        }
        nod.setNextElement(nod.getNextElement().getNextElement());
        size--;

    }

    @Override
    public int size() {
        return size;
    }

}
