public class ListElement {
    ListElement next;
    ListElement prev;
    int data;
    ListElement(int a) { data = a;}
    ListElement(ListElement a ) {
        data = a.data;
        //if(a.prev!=null) {
        //    prev = new ListElement(a.prev);
       // } else prev = null;
        //if(a.next!=null) {
         //   next = new ListElement(a.next);
        //} else next=null;
    }
}
