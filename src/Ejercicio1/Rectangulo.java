package Ejercicio1;

public class Rectangulo {
    // Atributos
    double base;
    double altura;

    // Metodos
    public String verDetalle() {
        // LLamamos a este metod para que concatene las oraciones
        StringBuilder sb = new StringBuilder();
        sb.append("rectangulov.altura = " + this.altura);
        sb.append("\nrectangulov.altura = " + this.base);
        return sb.toString();
    }

    public double valorArea(double base, double altura){

        return base * altura;

    }

    public double valorPerimetro(double base, double altura){
        return 2.0 * base + 2.0 * altura;
    }
}
