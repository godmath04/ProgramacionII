package Repaso2;
/*
Estudiante: Galo Guevara
Materia: Programación 2
Deber: S4: Taller de clases, objetos y métodos

Descripción:
    Generar una aplicación en java que permita el ingreso de datos de un empleado:
        *Cedula, nombre, genero, fecha de nacimiento, informacion de residencia
        *Salario
        *Fecha de ingreso

    La aplicación debe permitir:
        *Modificar salario
        *Calcular edad
        *Calcular prestaciones (antiguedad * salario/12)
 */


public class Main {
    public static void main(String[] args) {
        Empleaditos empleado1 = new Empleaditos();
        empleado1.fillInfo();

    }
}
