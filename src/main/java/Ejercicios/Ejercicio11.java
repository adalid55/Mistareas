package Ejercicios;

public class Ejercicio11 {
    
/** A basic doubly linked list implementation. */
public class DoublyLinkedList<E>{//---------------- nested Node class ----------------
private static class Node<E>{// reference to the element stored at this node
private E element;// reference to the previous node in the list
private Node<E> prev;// reference to the subsequent node in the list
private Node<E> next;
public Node(E e, Node<E> p, Node<E> n){
    element = e;
    prev = p;
    next = n;}
public E getElement(){return element;}
public Node<E> getPrev(){return prev;}
public Node<E> getNext(){return next;}
public void setPrev(Node<E> p){
    prev = p;}
public void setNext(Node<E> n){
    next = n;}}//----------- end of nested Node class -----------
// instance variables of the DoublyLinkedList
private Node<E> header;// header sentinel
private Node<E> trailer;// trailer sentinel
/** Constructs a new empty list. */
public DoublyLinkedList(){// create header
    header =new Node<>(null,null,null);// trailer is preceded by header
    trailer =new Node<>(null, header,null);// header is followed by trailer
    header.setNext(trailer);}// instance method of class DoublyLinkedList to calculate
// the size of the doubly linked list
public int size(){int count =0;// create a dummy temporary node whose next element is head
    //Node<E> temp = new Node<>(0,null, header);// if the next element is not null, increment counter by 1
    Node<E> temp = header;
    while(temp.getNext()!=null){ 
    count++;// move the dummy temporary node towards the trailer
    temp = temp.getNext();}// return the number of nodes in the linked list
return count;}}

    
}
