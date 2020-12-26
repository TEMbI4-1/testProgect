package mylinkedlist;

public class Nod {
    private int value;

    private Nod nextElement;


    public int getValue() {
        return value;
    }

    public Nod getNextElement() {
        return nextElement;
    }

    public void setNextElement(Nod nextElement) {
        this.nextElement = nextElement;
    }

    public Nod(int value, Nod nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }
}
