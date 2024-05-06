package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimetroArea {
    public static void main(String[] args) throws IOException {
        // Creando los objetos
        // Objeto de lectura desde el teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Objetos del programa
        Triangulo equilatero = new Triangulo();
        Cuadrado cuadradov = new Cuadrado();
        Rectangulo rectangulov = new Rectangulo();

        // Asignamos datos
        // PARA EL TRIANGULO
        // Ingreso de datos desde el teclado
        System.out.println("Ingrese la base del triangulo: ");
        equilatero.base = Double.parseDouble(br.readLine());

        System.out.println("Ingrese la altura del triangulo: ");
        equilatero.altura = Double.parseDouble(br.readLine());

        // Imprimimos los valores
        System.out.println(equilatero.verDetalle());
        System.out.println("El area del triangulo es: " + equilatero.valorArea(equilatero.base, equilatero.altura));
        System.out.println("El perimetro del triangulo es: " + equilatero.valorPerimetro(equilatero.base));
        System.out.println("\n");

        // PARA EL CUADRADO
        System.out.println("Ingrese el lado del cuadrado: ");
        cuadradov.lado = Double.parseDouble(br.readLine());
        //Impresion de valores

        System.out.println(cuadradov.verDetalle());
        System.out.println("El area del cuadrado es = " + cuadradov.valorArea(cuadradov.lado));
        System.out.println("El perimetro del cuadrado es = " + cuadradov.valorPerimetro(cuadradov.lado));
        System.out.println("\n");

        // PARA EL RECTANGULO
        System.out.println("Ingrese la base del rectangulo: ");
        rectangulov.base = Double.parseDouble(br.readLine());

        System.out.println("Ingrese la altura del rectangulo");
        rectangulov.altura = Double.parseDouble(br.readLine());

        // IMPRIMIR
        System.out.println(rectangulov.verDetalle());
        System.out.println("El area del rectangulo es = " + rectangulov.valorArea(rectangulov.base, rectangulov.altura));
        System.out.println("El perimetro del cuadrado es = " + rectangulov.valorPerimetro(rectangulov.base, rectangulov.altura));
    }
}
