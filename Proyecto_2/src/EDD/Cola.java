/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Cola<T> {

    private Nodo<T> Head;
    private Nodo<T> Tail;
    private int size;

    public Cola() {
        this.Head = this.Tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return Head == null;
    }

    public void Empty() {
        this.Head = this.Tail = null;
        this.size = 0;
    }

    /**
     * encola un elemnto en la cola
     *
     * @param data
     */
    public void encolar(T data) {
        Nodo<T> nuevo = new Nodo<>(data);
        if (isEmpty()) {
            Head = Tail = nuevo;
        } else {
            Tail.setpNext(nuevo);
            Tail=nuevo;
        }
        size += 1;
    }


    /**
     * desencola la cabeza de la cola
     */
    public void Desencolar() {
        if (!isEmpty()) {
            if (size == 1) {
                this.Empty();
            } else {
                Head = Head.getpNext();
                size -= 1;
            }
        }
    }

    public Nodo<T> getHead() {
        return Head;
    }

    public void setHead(Nodo<T> Head) {
        this.Head = Head;
    }

    public Nodo<T> getTail() {
        return Tail;
    }

    public void setTail(Nodo<T> Tail) {
        this.Tail = Tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
