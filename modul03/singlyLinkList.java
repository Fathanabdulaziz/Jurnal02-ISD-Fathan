import java.util.NoSuchElementException;

public class singlyLinkList {
    Node head;
    Node tail;
    String data;
    
    public singlyLinkList(){
        this("Kosong");
    }
    
    public singlyLinkList(String listdata) {
        data = listdata;
        head = tail = null;
    }
    private boolean isEmpty() {
        return head == null;
    }


    public void insertAtFront(buku insertItem) {
        Node newNode = new Node(insertItem);
        
        if (isEmpty()) {
            head = tail = new Node(insertItem);
        } else {
            newNode.next = head;
            head = newNode;
        }   
    }
    public void insertAtBack(buku insertItem) {
        Node newNode = new Node(insertItem);

        if (isEmpty()) {
            head = tail = new Node(insertItem);
        } else { 
            tail.next = newNode;
            tail = newNode;
        }
    }

    public buku removeFromBack(buku buku) throws NoSuchElementException {
        if (isEmpty()) { 
            throw new NoSuchElementException(data + "buku kosong");
    }
    buku removedItem = tail.data;
        if (head == tail) {
             head = tail = null;
        } else {
            Node iterator = head;
                while (iterator.next != tail) {
                    iterator = iterator.next;
                }
            tail = iterator;
            iterator.next = null;
        }
        return removedItem;
    }
    public void print() {
        if (isEmpty()) {
            System.out.printf("buku %s%n", data);
            return;
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("datanya ada:", data);
        Node iterator = head;

        while (iterator != null) {
            System.out.printf("%s  ", iterator.data);
            iterator = iterator.next;
        }
            System.out.println();
        }
    
}