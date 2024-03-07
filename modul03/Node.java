
public class Node {
    buku data;
    Node next;

    public Node(buku data){
        this.data = data;
        this.next = null;
    }

    public  buku getData(){
        return data;
    }
}
