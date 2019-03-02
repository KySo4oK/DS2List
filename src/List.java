public class List {
    ListElement front = null;
    ListElement back = null;
    int num=0;

    List(List a) {
        ListElement temp = a.front;
        while (temp!=null) {
            push_front(new ListElement(temp));
            temp = temp.prev;
        }
    }
    List(int k) {
        ListElement[] temp = new ListElement[10];
        for(int i=0; i<10; i++){
            temp[i] = new ListElement(i);
        }
        for(int i=0; i<k; i++){
            push_back(temp[(int)(Math.random()*10)]);
        }
    }

    void push_front(ListElement a) {
        if (isEmpty()){
            front = a;
            back = a;
            a.next = null;
            a.prev = null;
        } else {
            a.prev = front;
            a.next = null;
            front = a;
        }
        num++;
    }

    void push_back(ListElement a) {
        if (isEmpty()){
            front = a;
            back = a;
            a.next = null;
            a.prev = null;
        } else {
            a.next = back;
            a.prev = null;
            back = a;
        }
        num++;
    }

    ListElement pop_front(){
        ListElement temp = front;
        if(front.prev!=null) {
            front = front.prev;
            front.next = null;

        } else {
            front = null;
        }
        num--;
        return temp;
    }

    ListElement pop_back(){
        ListElement temp = back;
        if(back.next!=null) {
            back = back.next;
            back.prev = null;

        } else {
            back = null;
        }
        num--;
        return temp;
    }

    void print() {
        ListElement temp = front;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println("");
    }

    int size(){ return num; }

    void clear() {
        front =null;
        back = null;
        num=0;
    }

    boolean isEmpty() { return num==0; }
}