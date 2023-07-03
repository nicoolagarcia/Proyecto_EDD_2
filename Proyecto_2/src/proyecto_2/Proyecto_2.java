/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2;

import Class.Cliente;
import Class.Habitacion;
import Class.LectorCsv;
import EDD.Arbol;
import EDD.Cola;
import EDD.HashTable;
import IG.Ventana_1;

/**
 *
 * @author Nicola
 */
public class Proyecto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTable<Cliente> huespedes=new HashTable(1000);
        Cola[] tipos_hab=new Cola[4];
        for (int i = 0; i < 4; i++) {
            tipos_hab[i] = new Cola<Habitacion>();
        }
        Arbol reservaciones= new Arbol();
        LectorCsv lector= new LectorCsv();
        Habitacion[] habitaciones = lector.Crear_hab(tipos_hab);
        lector.Crear_huespedes(huespedes, tipos_hab);
        lector.Crear_reservados(reservaciones);
        lector.Crear_historicos(habitaciones);
        Ventana_1 v1=new Ventana_1(tipos_hab,huespedes,reservaciones);
    }
    
}
