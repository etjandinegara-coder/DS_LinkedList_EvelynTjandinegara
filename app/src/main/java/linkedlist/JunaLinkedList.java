package linkedlist;

class JunaLinkedList {
    JunaNode head;

    public static void main(String[] args) {
        JunaNode juna = new JunaNode (10);
        System.out.println(juna.data);
    }

    public JunaLinkedList(){
        this.head = null;
    }

    public void tambahDepan(int data){
        JunaNode newNode = new JunaNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void tambahBelakang(int data){
        JunaNode newNode = new JunaNode(data);
        if(head == null){
            head = newNode;
            return;
        }

        JunaNode current = head; //pointernya
        while (current.next != null) {
        current = current.next;
    }

        current.next = newNode;
    }

    public void cetaklist(){
        JunaNode current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public boolean cari(int data) {
        JunaNode current = head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void delete(int key) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    if (head.data == key) {
        head = head.next;
        return;
    }

    JunaNode current = head;

    while (current.next != null && current.next.data != key) {
        System.out.println("angka " +key+ " belum ketemu");
        current = current.next;
    }

    if (current.next == null) {
        System.out.println("data tidak dtemukan");
    } else {
        System.out.println("data tidak dtemukan. menghapus data");
        current.next = current.next.next;
    }
} 

}