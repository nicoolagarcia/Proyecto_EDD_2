/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import EDD.Lista;
import EDD.Nodo;

/**
 *
 * @author Nicola
 */
public class Habitacion {
    private int numero;
    private String tipo;
    private int piso;
    private String historial="En esta habitacion se han hospedado:\n";
    private int hospedados=0;

    public Habitacion(int numero, String tipo, int piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.piso = piso;
    }
    public void actualizarHistorial(Cliente huesped){
    hospedados++;
        this.historial+=hospedados+". "+huesped.getName()+" "+huesped.getLastName()+", llego el: "+huesped.getReservacion().getLlegada();
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
   
    
}
