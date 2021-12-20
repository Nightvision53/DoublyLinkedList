public class app extends LabDoublyLinkedList<String> {
    public static void main(String[] args) {
        LabDoublyLinkedList<String> liste = new LabDoublyLinkedList<String>();
        liste.addFirst("patates");
        liste.addFirst("domates");
        liste.addFirst("salata");
        liste.addFirst("üzüm");
        liste.removeAt(2);
        liste.print();

    }
}
