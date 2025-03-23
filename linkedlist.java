public class linkedlist {

    private class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    private Node head;
     public linkedlist (){
        this.head = null;
     }

     public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     public void insertAtEnd(int data){
Node newNode = new Node(data);
     
     if(head == null){
        head = newNode;
        return;
     }
       Node current = head;
       while(current.next != null){
        current = current.next;
       }
        
       current.next = newNode;
       }

       public void deleteFromBeginning(){
        if(head == null){
            System.out.println("The list is empty.Nothing to delete.");
            return;
        }
        head = head.next;
    }
    
    public void display() {
    
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
       
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
   
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        
        
        System.out.println("Inserting 10 at the beginning:");
        list.insertAtBeginning(10);
        list.display();
        
        System.out.println("Inserting 20 at the beginning:");
        list.insertAtBeginning(20);
        list.display();
        
       
        System.out.println("Inserting 30 at the end:");
        list.insertAtEnd(30);
        list.display();
        
        System.out.println("Inserting 40 at the end:");
        list.insertAtEnd(40);
        list.display();
        
       
        System.out.println("Deleting from the beginning:");
        list.deleteFromBeginning();
        list.display();
        
        System.out.println("Deleting from the beginning again:");
        list.deleteFromBeginning();
        list.display();
    }
}
