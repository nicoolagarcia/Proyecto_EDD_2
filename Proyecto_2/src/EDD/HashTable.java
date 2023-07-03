/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 * @param <T>
 */
public class HashTable<T> {

    private int size;
    private Nodo<T>[] table;

    /**
     * Contructor de HashTable
     * @param size
     */
    public HashTable(int size) {
        this.size = size;
        table = new Nodo[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    /**
     * Convierte la cadena d e la llave en un entero del tamagno del arreglo
     * @param key
     * @return
     */
    public int getHash(String key) {
        int hash = key.toLowerCase().hashCode() % size;
        if (hash < 0) {
            hash = hash * -1;
        }
        return hash;
    }
    

    /**
     * Inserta el dato donde indique el hash de la llave
     * @param key
     * @param data
     */
    public void insertar(String key, T data) {
        int hash = getHash(key.toLowerCase());
        if (table[hash] == null) {
            table[hash] = new Nodo(data);
        } else {
            Nodo aux = table[hash];
            while (aux.getpNext() != null) {
                aux = aux.getpNext();
            }
            aux.setpNext(new Nodo(data));
        }
    }

    /**s
     * Retorna el indice del hash de la cadena tomada como llave
     * @param key
     * @return
     */
    public Nodo encontrar(String key) {
        int hash = getHash(key.toLowerCase());
        if (table[hash] == null) {
            return null;
        } else {
            return table[hash];
        }
    }
    
}
