/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Nicola
 */
public class Cliente {

    private String name;
    private String lastName;
    private int id;
    private String email;
    private String gender;
    private String cel;
    private Habitacion habitacion;
    private Reservacion reservacion;

    public Cliente(String name, String lastName, int id, String email, String gender, String cel) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.cel = cel;
    }

    public Cliente(String name, String lastName, int id, String email, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.gender = gender;
    }

    public Cliente(String name, String lastName, String email, String gender, String cel) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.cel = cel;
    }

    public String mostrarhuesped() {
        String cadena = "La Persona: ";
        cadena += this.name + " " + this.lastName + "\nSe encuentra hospedado en la habitacion " + this.habitacion.getNumero() + " de tipo " + this.habitacion.getTipo() + " piso " + this.habitacion.getPiso();
        return cadena;

    }

    public String mostrarreservacion() {
        String cadena = "La Persona: ";
        cadena += this.name + " " + this.lastName + "\nReservo una habitacion de tipo " + this.reservacion.getTipo_hab() + "\nDesde: " + this.reservacion.getLlegada() + "\nHasta: " + this.reservacion.getSalida();
        return cadena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

}
