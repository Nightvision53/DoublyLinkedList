public class app extends LabDoublyLinkedList<String> {
    public static void main(String[] args) {
        LabDoublyLinkedList<String> liste = new LabDoublyLinkedList<String>();
        liste.addFirst("zihinsel");
        liste.addFirst("Sorun");
        liste.addFirst("napim");
        liste.addFirst("zort");
        liste.removeAt(2);
        liste.print();

    }
}