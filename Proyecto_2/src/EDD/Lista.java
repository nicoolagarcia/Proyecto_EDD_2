/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Lista <T> {

    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return pFirst == null;
    }

    public void Append(T data) {
        Nodo<T> nuevo = new Nodo<>(data);
        if (isEmpty()) {
            pFirst = nuevo;
            pLast = nuevo;
        } else {
            Nodo aux = pLast;
            aux.setpNext(nuevo);
            pLast = nuevo;
        }
        size += 1;
    }
    
    public void Print() {
        if (!isEmpty()) {
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getData() + " ");
                aux = aux.getpNext();
            }
        } else {
            System.out.println("lA LISTA ESTA VACIA");
        }
    }
    
    public void deleteFirst(){
    if (!isEmpty()){
    pFirst=pFirst.getpNext();
    size-=1;
    }
    }
    public Nodo<T> getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo<T> pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo<T> getpLast() {
        return pLast;
    }

    public void setpLast(Nodo<T> pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}

