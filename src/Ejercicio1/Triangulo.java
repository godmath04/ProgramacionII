package Ejercicio1;

public class Triangulo {
    // Atributos
    double base;
    double altura;

    // Metodos
    public String verDetalle() {
        // LLamamos a este metod para que concatene las oraciones
        StringBuilder sb = new StringBuilder();
        sb.append("equilatero.altura = " + this.altura);
        sb.append("\nequilatero.base = " + this.base);
        return sb.toString();
    }

    public double valorArea(double base, double altura){

        return (base * altura)/2.0;

    }

    public double valorPerimetro(double base){
        return base* 3.0;
    }


}
