package Ejercicio5;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    String cedula;
    String nombre;
    String apellido;
    String genero;
    double salario;
    double prestaciones;
    LocalDate fechaNacimiento;
    LocalDate fechaIngreso;

    // Metodo para solicitar los datos del usuario
    public void ingresoDatos() {
        cedula = JOptionPane.showInputDialog("Ingrese su cedula ");
        nombre = JOptionPane.showInputDialog("Ingrese su nombre ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido ");
        genero = JOptionPane.showInputDialog("Ingrese su genero ");
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario "));
        fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de nacimiento: AAAA-MM-DD"));
        fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de ingreso: AAAA-MM-DD"));

    }

    // Metodo para obtener la edad
    public int obtenerEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento,fechaActual);
        return periodo.getYears();
    }
    //Metodo para obtener anios trabajos
    public double obtenerAniosTrabajo(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaIngreso,fechaActual);
        return (double)periodo.getYears() + (double) periodo.getMonths() / 12.0 + (double) periodo.getDays() / 365.0;
    }

    // Metodo para hacer el calculo de remuneraciones
    public double remuneracion(){
        prestaciones = (obtenerAniosTrabajo() * salario ) / 12;
        return prestaciones;
    }


    // Metodo para mostrar los datos
    public String datos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cedula: " + this.cedula);
        sb.append("\nNombre:  " + this.nombre);
        sb.append("\nApellido: " + this.apellido);
        sb.append("\nApellido: " + this.genero);
        sb.append("\nSalario:" + this.salario);
        sb.append("\nNacimiento: " + this.fechaNacimiento);
        sb.append("\nEdad:" + obtenerEdad() + " anios");
        sb.append("\nFecha de Ingreso: " + this.fechaIngreso);
        sb.append("\nAnios de trabajo:" + obtenerAniosTrabajo() + " anios");
        sb.append("\nSus prestaciones son: " + remuneracion());
        return sb.toString();
    }
}
