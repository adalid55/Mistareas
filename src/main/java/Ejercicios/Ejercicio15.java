package Ejercicios;

public class Ejercicio15 {
    
public class CircularlyLinkedList<E>{
//---------------- nested Node class ----------------
private static class Node<E>{// reference to the element stored at this node
private E element;// reference to the subsequent node in the list
private Node<E> next;
public Node(E e, Node<E> n){
            element = e;
            next = n;}
public E getElement(){return element;}
public Node<E> getNext(){return next;}
public void setNext(Node<E> n){
            next = n;}}//----------- end of nested Node class -----------
// instance variables of the CircularlyLinkedList
private Node<E> tail = null;// we store tail (but not head)
private int size = 0;// number of nodes in the list
public CircularlyLinkedList(){}// constructs an initially empty list
// instance method to check if two CLL are identical
boolean equals(CircularlyLinkedList<E> listb){// two dummy nodes to traverse the two CLL's
        Node<E> temp1 = tail.getNext();
        Node<E> temp2 = listb.tail.getNext();// count variable to iterate till the size of the CLL
int count = 0;// if the size of the two CLL's are different then,
// they are not identical
if(size != listb.size())return false;// if their sizes are equal, then we have to compare each
// element of CLL 1 with corresponding element of CLL 2
else{// Iteratively compare the elements of both CLL's
// example: CLL_1 = 3->7->1->9 & CLL_2 = 3->7->4->9
// when count = 0, CLL_1.element(3) = CLL_2.element(3) 
// when count = 1, CLL_1.element(7) = CLL_2.element(7) 
// when count = 2, CLL_1.element(1) != CLL_2.element(4)
//                 return false 
while(count < size){// If at any position, the element at CLL 1 is
// different than the element at CLL 2, return false
if(temp1.element != temp2.element)return false;// If we reach here, then temp1.element is same as
// temp2.element, so move to next nodes in both lists 
        temp1 = temp1.getnext(); 
        temp2 = temp2.getnext();
}
}
    <FONT COLOR=GREEN><I>
// If linked lists are identical at each element, return true
        return true;
}
} 

    
}
