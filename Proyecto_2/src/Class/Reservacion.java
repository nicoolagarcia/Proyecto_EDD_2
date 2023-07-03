/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Nicola
 */
public class Reservacion {
    private String llegada;
    private String salida;
    private String tipo_hab;

    public Reservacion(String llegada) {
        this.llegada = llegada;
    }

    public Reservacion(String llegada, String salida,String tipo_hab) {
        this.llegada = llegada;
        this.salida = salida;
        this.tipo_hab=tipo_hab;
    }

    public String getTipo_hab() {
        return tipo_hab;
    }

    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    
}
