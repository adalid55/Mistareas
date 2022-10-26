package Ejercicios;
 
    class Ejercicio6 {
        Node head;
        class Node {
        int data;
        Node next;
            Node(int d){
                data = d;
                next =null;
            }
        }

    void printSecondFromLast(){
    Node temp = head;
    if(temp == null)
    System.out.println("No node in linked list");
    else if(temp.next == null)
    System.out.println("Only one node in linked list");
    else{
        while(temp.next.next !=null){

        temp = temp.next;
        }
    System.out.println(temp.data);
        }
    }

    public void push(int new_data){
    Node new_node =new Node(new_data);
    new_node.next = head;
     head = new_node;
    }

    public static void main(String [] args) {
            Ejercicio6 llist = new Ejercicio6();
            llist.push(4);
            llist.push(2);
            llist.push(7);
            llist.push(11);
            llist.printSecondFromLast();
        }   
}