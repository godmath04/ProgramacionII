package Repaso2;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Empleaditos {
    String cedula;
    String nombre;
    String genero;
    LocalDate fechaNacimiento;
    LocalDate fechaIngreso;

    //Metodo de llenar info
    public void fillInfo() {
        JOptionPane.showMessageDialog(null, "DATOS DEL EMPLEADO\n");
        cedula = JOptionPane.showInputDialog("Ingrese su cedula: ");
        nombre = JOptionPane.showInputDialog("Ingrse su nombre: ");
        genero = JOptionPane.showInputDialog("Ingrese su genero: ");
        fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha YYYY-MM-DD"));
        JOptionPane.showMessageDialog(null, "Su edad es: " + obtenerEdad());
        fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de ingreso YYYY-MM-DD"));
        JOptionPane.showMessageDialog(null, "Su tiempo en trabajo es: " + obtenerTiempo());


    }
    //Metodo calcular aedad
    public int obtenerEdad(){
        Period periodoTiempo;
        LocalDate fechaActual;
        fechaActual = LocalDate.now();
        periodoTiempo = Period.between(fechaNacimiento, fechaActual);
        return periodoTiempo.getYears();
    }

    public float obtenerTiempo(){
        Period periodoTrabajo;
        LocalDate trabajoHoy = LocalDate.now();
        periodoTrabajo = Period.between(fechaIngreso, trabajoHoy);
        return (float )(periodoTrabajo.getYears() + periodoTrabajo.getDays()/360.0 + periodoTrabajo.getMonths()/12);

    }
}