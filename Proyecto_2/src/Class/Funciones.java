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
        String key = nombre.toLowerCase() + apellido.toLowerCase();
        Nodo<Cliente> aux = huespedes.encontrar(key);
        while(aux!= null){
            if ( aux.getData().getName().toLowerCase().equals(nombre.toLowerCase()) && aux.getData().getLastName().toLowerCase().equals(apellido.toLowerCase())) {
            return aux.getData();
        } else{
            aux=aux.getpNext();
            }
        }
        return null;
    }
    
     public void EliminarHuesped(HashTable huespedes, String nombre, String apellido) {
        String key = nombre.toLowerCase() + apellido.toLowerCase();
        Nodo<Cliente> aux = huespedes.encontrar(key);
         do {
            if ( aux.getData().getName().toLowerCase().equals(nombre.toLowerCase()) && aux.getData().getLastName().toLowerCase().equals(apellido.toLowerCase())) {
                if (aux.getpNext()==null) {
                aux.setData(null);
                } else{
                aux.setData((Cliente) aux.getpNext().getData());
                }
        } else
            aux=aux.getpNext();
         } while (aux.getpNext()!=null);
           }
    public String Capitalice(String cadena){
     String palabra = cadena;
        String primeraLetraMayuscula=cadena;
        if (palabra.length() > 0) {
            primeraLetraMayuscula = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
        }
        return primeraLetraMayuscula;
    }
}
