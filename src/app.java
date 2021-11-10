public class app extends LabDoublyLinkedList<String> {
    public static void main(String[] args) {
        LabDoublyLinkedList<String> liste = new LabDoublyLinkedList<String>();
        liste.addFirst("naber");
        liste.addFirst("napim");
        liste.addFirst("Annen");
        liste.addFirst("zortladın");

        liste.print();

    }
}