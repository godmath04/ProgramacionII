package Ejercicio2;

import javax.swing.*;


public class OperacionesBasicas {
    //Atributos a usar
    int numero1;
    int numero2;
    double resultado;

    // Constructor de la clase para que inicie en cero
    public OperacionesBasicas(){
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }

    // Metodos para utilizar
    // SUMA
    public void suma(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero "));
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }

    // RESTA
    public void resta(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero "));
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    // MULTIPLICACION
    public void multiplicacion(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero "));
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    // DIVISION
    public void division(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero "));
        resultado = (double) numero1 / numero2;
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }

}
