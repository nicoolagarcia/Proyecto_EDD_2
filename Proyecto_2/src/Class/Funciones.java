/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import EDD.HashTable;
import EDD.Nodo;

/**
 *
 * @author Nicola
 */
public class Funciones {

    public Cliente EncontrarHuesped(HashTable huespedes, String nombre, String apellido) {
        String key = nombre + apellido;
        Nodo<Cliente> aux = huespedes.encontrar(key);
        while(aux!= null){
            if ( aux.getData().getName()!=nombre && aux.getData().getLastName()!=apellido) {
            return aux.getData();
        } else{
            aux=aux.getpNext();
            }
        }
        return null;
    }
    
    public
    
}
