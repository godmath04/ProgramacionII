package Ejercicio5;

import javax.swing.*;

public class RemuneracionesEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.ingresoDatos();
        JOptionPane.showMessageDialog(null, empleado1.datos());
    }
}
