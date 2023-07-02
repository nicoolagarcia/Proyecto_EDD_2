/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicola
 */
public class LectorCsv {
    public static void Crear_hab(String[] args) {
        String csvFile = "ruta/al/archivo.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                // Accede a los datos de cada columna
                int columna1 = Integer.parseInt(data[0]);
                String columna2 = data[1];
                int columna3 = Integer.parseInt(data[2]);
                new Habitacion(columna1,columna2,columna3);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, por favor vuelva a intentar");
        }
    }
}