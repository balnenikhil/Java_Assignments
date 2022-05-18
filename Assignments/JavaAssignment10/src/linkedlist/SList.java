package linkedlist;

class SList<T> {
    Node<T> head;

    SList() {
        this.head = null;
    }

    SList(String data) {
        this.head = new Node(data);
    }

    public SListIterator<T> getIterator() {
        return new SListIterator<T>(head);
    }
}
