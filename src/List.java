public class List {
    ListElement front = null;
    ListElement back = null;
    int num = 0;

    List getCopyOfList(List a) {
        List a1 = new List();
        List copyls = new List();
        ListElement temp;
        while (!a.isEmpty()) {
            temp = a.pop_front();
            copyls.push_back(temp.getData());
            a1.push_back(temp.getData());
        }
        a.front = a1.front;
        a.back = a1.back;
        a.num = a1.num;
        return copyls;
    }

    List() {
    }

    public void push_front(int a1) {
        ListElement a = new ListElement(a1);
        if (isEmpty()) {
            back = a;
            front = a;
            a.setNext(null);
            a.setPrev(null);
        } else {
            front.setPrev(a);
            a.setNext(front);
            a.setPrev(null);
            front = a;
        }
        num++;
    }

    public void push_back(int a1) {
        ListElement a = new ListElement(a1);
        if (isEmpty()) {
            front = a;
            back = a;
            a.setNext(null);
            a.setPrev(null);
        } else {
            back.setNext(a);
            a.setPrev(back);
            a.setNext(null);
            back = a;
        }
        num++;
    }

    public ListElement pop_front() {
        ListElement temp = new ListElement(front.getData());
        if (front.getNext() != null) {
            front = front.getNext();
            front.setPrev(null);
        } else {
            front = null;
        }
        num--;
        return temp;
    }

    public ListElement pop_back() {
        ListElement temp = new ListElement(back.getData());
        if (back.getPrev() != null) {
            back = back.getPrev();
            back.setNext(null);

        } else {
            back = null;
        }
        num--;
        return temp;
    }

    public void print() {
        ListElement temp = front;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int size() {
        return num;
    }

    public void clear() {
        front = null;
        back = null;
        num = 0;
    }

    public boolean isEmpty() {
        return num == 0;
    }
}
