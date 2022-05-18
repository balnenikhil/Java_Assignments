package linkedlist;


//Single Linked List Implementation with Iterator to Iterate through List






public class LinkedList {

    public static void main(String[] args) {
        SList<String> names = new SList<>();
        SListIterator it = names.getIterator();
        it.insert("Nikhil");
        it.insert("Nandan");
        it.insert("Anudeep");
        it.display();
        it.delete("Nandan");
        it.delete("Anudeep");
        it.display();
    }

}
