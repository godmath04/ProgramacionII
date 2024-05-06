package Ejercicio3;

import javax.swing.*;

public class Ej3Vehiculos {
    public static void main(String[] args) {
        //Creacion del objeto
        Vehiculos autoUno = new Vehiculos();
        //Lamar al metodo para la informacion
        autoUno.ingresoInformacion();
        // Mostrar la informacion
        JOptionPane.showMessageDialog(null, autoUno.detalles());
    }
}
