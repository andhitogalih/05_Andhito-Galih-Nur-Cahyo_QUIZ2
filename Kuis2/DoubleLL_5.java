import java.io.PrintStream;

public class DoubleLL_5 {
    Node_5 head;
    int size;

    public DoubleLL_5(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(String namaPembeli, String Nohp){
        if(isEmpty()){
            head = new Node_5(null, namaPembeli, Nohp, null);
        }else{
            Node_5 newNode = new Node_5(null, namaPembeli, Nohp, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            Node_5 tmp = head;
            while (tmp != null){
                System.out.println("ID: " + tmp.namaPembeli);
                System.out.println("No Hp: " + tmp.Nohp);
                tmp = tmp.next;

            }
            System.out.println("\nBerhasil Diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
