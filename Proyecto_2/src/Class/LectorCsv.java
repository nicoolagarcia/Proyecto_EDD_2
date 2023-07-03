/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import EDD.Arbol;
import EDD.Cola;
import EDD.HashTable;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicola
 */
public class LectorCsv {

    public LectorCsv() {
    }

    public Habitacion[] Crear_hab(Cola[] tipos_hab) {
        String csvFile = "test\\Booking_hotel - habitaciones.csv";
        String line;
        String csvSplitBy = ",";
        int numline = 0;
        Habitacion[] habitaciones= new Habitacion[300];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (numline == 0) {
                    //Estan los titulos
                } else {
                    int columna1 = Integer.parseInt(data[0]);
                    String columna2 = data[1];
                    int columna3 = Integer.parseInt(data[2]);
                    Habitacion nueva_hab = new Habitacion(columna1, columna2, columna3);
                    if ("simple".equals(nueva_hab.getTipo())) {
                        tipos_hab[0].encolar(nueva_hab);
                    } else if ("doble".equals(nueva_hab.getTipo())) {
                        tipos_hab[1].encolar(nueva_hab);

                    } else if ("triple".equals(nueva_hab.getTipo())) {
                        tipos_hab[2].encolar(nueva_hab);

                    } else {
                        tipos_hab[3].encolar(nueva_hab);
                    }
                    habitaciones[columna1-1]=nueva_hab;
                }
                numline++;
            }
            return habitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, por favor vuelva a intentar");
            return null;
        }
    }

    public void Crear_huespedes(HashTable huespedes, Cola[] tipos_hab) {
        String csvFile = "test\\Booking_hotel - estado.csv";
        String line;
        String csvSplitBy = ",";
        int numline = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                if (numline == 0) {
                    //Estan los titulos
                } else {
                    String nombre = data[1];
                    String apellido = data[2];
                    String email = data[3];
                    String genero = data[4];
                    String celular = data[5];
                    String llegada = data[6];
                    Cliente huesped = new Cliente(nombre, apellido, email, genero, celular);
                    huesped.setReservacion(new Reservacion(llegada));
                    if (!tipos_hab[0].isEmpty()) {
                        huesped.setHabitacion((Habitacion) tipos_hab[0].getHead().getData());
                        tipos_hab[0].Desencolar();
                    } else if (!tipos_hab[1].isEmpty()) {
                        huesped.setHabitacion((Habitacion) tipos_hab[1].getHead().getData());
                        tipos_hab[1].Desencolar();
                    } else if (!tipos_hab[2].isEmpty()) {
                        huesped.setHabitacion((Habitacion) tipos_hab[2].getHead().getData());
                        tipos_hab[2].Desencolar();
                    } else {
                        huesped.setHabitacion((Habitacion) tipos_hab[3].getHead().getData());
                        tipos_hab[3].Desencolar();
                    }
                    huespedes.insertar(huesped.getName() + huesped.getLastName(), huesped);
                }
                numline++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, por favor vuelva a intentar");
        }
    }

    public void Crear_reservados(Arbol reservaciones) {
        String csvFile = "test\\Booking_hotel - reservas.csv";
        String line;
        String csvSplitBy = ",";
        int numline = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (numline == 0) {
                    //Estan los titulos
                } else {
                    int columna1 = Integer.parseInt(data[0].replace(".", ""));
                    String columna2 = data[1];
                    String columna3 = data[2];
                    String columna4 = data[3];
                    String columna5 = data[4];
                    String columna6 = data[5];
                    String columna7 = data[6];
                    String columna8 = data[7];
                    String columna9 = data[8];
                    Cliente actual = new Cliente(columna2, columna3, columna1, columna4, columna5, columna7);
                    actual.setReservacion(new Reservacion(columna8, columna9, columna6));
                    reservaciones.insertar(actual);
                }
                numline++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, por favor vuelva a intentar");
        }
    }

     public void Crear_historicos(Habitacion[] habitaciones) {
        String csvFile = "test\\Booking_hotel - Histórico.csv";
        String line;
        String csvSplitBy = ",";
        int numline = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (numline == 0) {
                    //Estan los titulos
                } else {
                    int columna1 = Integer.parseInt(data[0].replace(".", ""));
                    String columna2 = data[1];
                    String columna3 = data[2];
                    String columna4 = data[3];
                    String columna5 = data[4];
                    String columna6 = data[5];
                    int columna7 = Integer.parseInt(data[6]);
                    Cliente actual = new Cliente(columna2, columna3, columna1, columna4, columna5);
                    actual.setReservacion(new Reservacion( columna6));
                    habitaciones[columna7-1].actualizarHistorial(actual);
                }
                numline++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, por favor vuelva a intentar");
        }
    }
    
}
