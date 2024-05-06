package Ejercicio1;

public class Cuadrado {
    // Atributos
    double lado;

    // Metodos
    public String verDetalle() {
        return "cudrado.lado = " + this.lado;
    }

    public double valorArea(double lado){

        return lado * lado;

    }

    public double valorPerimetro(double lado){
        return 4.0 * lado;
    }
}


