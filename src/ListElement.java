public class ListElement {
    ListElement next;
    ListElement prev;
    int data;
    ListElement(int a) { data = a;}
    ListElement(ListElement a ) {
        data = a.data;
    }
}
