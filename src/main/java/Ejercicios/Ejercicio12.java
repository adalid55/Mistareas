package Ejercicios;

public class Ejercicio12 {
    
public class SinglyLinkedList<E>{
private static class Node<E>{

private E element;
private Node<E> next;
public Node(E e, Node<E> n){
    element = e;
    next = n;}
public E getElement(){return element;}
public Node<E> getNext(){return next;}
public void setNext(Node<E> n){
    next = n;}}

private Node<E> head = null;// last node of the list (or null if empty)
private Node<E> tail =null;// number of nodes in the list
private int size = 0;// constructs an initially empty list

public SinglyLinkedList(){}// instance method to rotate the linked list
// LL = 2->5->1->9 LL.rotateLL(2) = 1->9->2->5

public boolean isEmpty( ) { return size == 0; }

public void addLast(E e) {              // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null);   // node will eventually be the tail
        if (isEmpty( ))
        head = newest;                          // special case: previously empty list
        else
        tail.setNext(newest);                   // new node after existing tail
        tail = newest;                          // new node becomes the tail
        size++;
        } 

public E removeFirst( ) {               // removes and returns the first element
        if (isEmpty( )) return null;            // nothing to remove
        E answer = head.getElement( );
        head = head.getNext( );                 // will become null if list had only one node
        size--;
        if (size == 0)
        tail = null;                            // special case as list is now empty
        return answer;
        }

public void rotateLL(int k){// only rotate if minimum size of LL is 2 and
// k(number of rotations) is positive
if(size>1 && k >0){// Iteratively remove the first element and add
// it to the end of LL for (size-1) iterations
// Ex: LL = 2->5->1->9
// When count = 1, LL = 5->1->9->2
// When count = 2, LL = 1->9->2->5
// When count = 3, LL = 9->2->5->1
for(int count =1; count <= k; count++){
   addLast(removeFirst());
    }
  }
 }
}

    
}
