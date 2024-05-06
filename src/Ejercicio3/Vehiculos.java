package Ejercicio3;

import javax.swing.*;

public class Vehiculos {
    // Atributos de cada vehiculo
    String marca;
    String modelo;
    String numeroMotor;
    int numeroVentanas;
    int numeroPuertas;
    double kmInicial;
    double kmFinal;
    double kmRecorrido;
    // Costructor kilometraje y cantidades
    public Vehiculos(){
        numeroVentanas = 0;
        numeroPuertas = 0;
        kmInicial = 0.0;
        kmFinal = 0.0;
        kmRecorrido = 0.0;
    }

    // Metodo para ingresar los datos
    public void ingresoInformacion(){
        marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
        modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
        numeroMotor = JOptionPane.showInputDialog("Ingrese el numero del motor del vehiculo");
        numeroVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventanas"));
        numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas"));
        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Kilometraje inicial"));
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Kilometraje final"));
        if (kmFinal > kmInicial){
            kmRecorrido = kmFinal - kmInicial;
        }else {
            JOptionPane.showMessageDialog(null, "Se ha ingresado mal el kilometraje");
        }

    }

    // Metodo para mostrar todos los detalles
    public String detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo: " + this.modelo);
        sb.append("\nMarca: " + this.marca);
        sb.append("\nN. de Motor: " + this.numeroMotor);
        sb.append("\nN. de Ventanas: " + this.numeroVentanas);
        sb.append("\nN. de Puertas: " + this.numeroPuertas);
        sb.append("\nEl km inicial es: " + this.kmInicial);
        sb.append("\n El km final es: " + this.kmFinal);
        sb.append("\n El km recorrido es: " + this.kmRecorrido);
    return sb.toString();
    }

}
