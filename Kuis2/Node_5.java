public class Node_5 {
    int data;
    String namaPembeli, Nohp;
    Node_5 prev, next;
    
    Node_5(Node_5 prev, String namaPembeli,String Nohp, Node_5 next){
        this.prev = prev;
        this.namaPembeli = namaPembeli;
        this.Nohp = Nohp;
        this.next =  next;
    }

}
