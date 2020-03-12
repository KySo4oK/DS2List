public class ListElement {
    private ListElement next;
    private ListElement prev;
    private int data;

    ListElement(int a) {
        data = a;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListElement(ListElement a) {
        data = a.data;
    }
}
