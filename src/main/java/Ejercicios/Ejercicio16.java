package Ejercicios;

public class Ejercicio16 {
    
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
    public Node<E> getPrev(){return prev;
    }
    }
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
            header.setNext(trailer);
    }
    <FONT COLOR=GREEN><I>// instance method to check if two DLL are identical
        
    boolean equals(DoublyLinkedList<E> listb)
    {
    // two dummy nodes to traverse the two DLL's
    Node<E> temp1 = header;
    Node<E> temp2 = listb.header;
    // count variable to iterate till the size of the CLL
    int count = 0;
    // if the size of the two DLL's are different then,
            // they are not identical
    if(size != listb.size())
    return false;
    // if their sizes are equal, then we have to compare each
            // element of DLL 1 with corresponding element of DLL 2
    else{
    // Iteratively compare the elements of both DLL's
                // example: DLL_1 = 3<->7<->1<->9 & DLL_2 = 3<->7<->4<->9
                // when count = 0, DLL_1.element(3) = DLL_2.element(3)
                // when count = 1, DLL_1.element(7) = DLL_2.element(7)
                // when count = 2, DLL_1.element(1) != DLL_2.element(4)
                //                 return false
    while (count < size)
    {
    // If at any position, the element at DLL 1 is
                    // different than the element at DLL 2, return false
    if (temp1.element != temp2.element)
    return false;

    // If we reach here, then temp1.element is same as
                    // temp2.element, so move to next nodes in both lists
    temp1 = temp1.getnext();
    temp2 = temp2.getnext();
    }
    }
    // If linked lists are identical at each element, return true
    return true;
    }
}    

        


