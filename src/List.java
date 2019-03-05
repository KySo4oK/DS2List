public class List {
    ListElement front = null;
    ListElement back = null;
    int num=0;

    List copyList(List a) {
        List a1 = new List();
        List copyls = new List();
        ListElement temp;
        while (!a.isEmpty()){
            temp =a.pop_front();
            copyls.push_back(temp.data);
            a1.push_back(temp.data);
        }
        a.front =  a1.front;
        a.back = a1.back;
        a.num =a1.num;
        return copyls;
    }

    List(){}

    void push_front(int a1) {
        ListElement a = new ListElement(a1);
        if (isEmpty()){
            back = a;
            front = a;
            a.next = null;
            a.prev = null;
        } else {
            front.prev = a;
            a.next = front;
            a.prev = null;
            front = a;
        }
        num++;
    }

    void push_back(int a1) {
        ListElement a = new ListElement(a1);
        if (isEmpty()){
            front = a;
            back = a;
            a.next = null;
            a.prev = null;
        } else {
            back.next = a;
            a.prev = back;
            a.next = null;
            back = a;
        }
        num++;
    }

    ListElement pop_front(){
        ListElement temp = new ListElement(front.data);
        if (front.next != null) {
                front = front.next;
                front.prev = null;
        } else {
                front = null;
        }
        num--;
        return temp;
    }

    ListElement pop_back(){
        ListElement temp = new ListElement(back.data);
        if(back.prev!=null) {
            back = back.prev;
            back.next = null;

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
            temp = temp.next;
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
